package Ch12;

class A {
	int a;
	public A(int a) {
		super();
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}	
}
class B extends A{
	int b;

	public B(int a, int b) {
		super(a);
		this.b = b;
	}

	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
	
}
class C extends A{
	int c;

	public C(int a, int c) {
		super(a);
		this.c = c;
	}

	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}
	
}
class D extends B{
	int d;

	public D(int a, int b, int d) {
		super(a, b);
		this.d = d;
	}

	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}
	
}
class E extends B{
	int e;

	public E(int a, int b, int e) {
		super(a, b);
		this.e = e;
	}

	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}
	
}
class F extends C{
	int f;

	public F(int a, int c, int f) {
		super(a, c);
		this.f = f;
	}

	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}
	
}
class G extends C{
	int g;

	public G(int a, int c, int g) {
		super(a, c);
		this.g = g;
	}

	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}
	
}

public class C05UpDownCastingMain {

	public static void UpDownTestFunc(A obj,int... args) 
	{
		obj.a=args[0];
		
		if(obj instanceof B) {
			B down = (B)obj;	//downcasting
			down.b=args[1];
		}else if(obj instanceof C) {
			C down = (C)obj;
			down.c=args[1];
		}
		
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		A ob1 = new A(10);
		B ob2 = new B(11,12);
		C ob3 = new C(13,14);
		D ob4 = new D(15,16,17);
		E ob5 = new E(18,19,20);
		F ob6 = new F(21,22,23);
		G ob7 = new G(24,25,26);
		
		UpDownTestFunc(ob1,15); // A obj = ob1 //NoCasting
		UpDownTestFunc(ob2,99,98); // A obj = ob2 //UpCasting
		UpDownTestFunc(ob3,77,66);
//		UpDownTestFunc(ob4);
//		UpDownTestFunc(ob5);
//		UpDownTestFunc(ob6);
//		UpDownTestFunc(ob7);
	}
	
}
