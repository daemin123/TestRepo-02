package Ch13;

// 일반클래스 상속관계
class Super1 {
	void Func() {};
}
class Son1 extends Super1 {
	void Func() {
		System.out.println("Son1's Function()");
	}
}

// 추상클래스 상속관계
abstract class Super2 {
	abstract void Func();
}
class Son2 extends Super2 {
	void Func() {
		System.out.println("Son2's Function()");
	}
}

public class C01AbstractMain {
			// 추상 클래스 : 추상 메서드(선언만 한 상태를 가지는)를 하나 이상 포함해야 한다.
			// 추상 메서드가 포함된 클래스는 반드시 추상 클래스로 정의되어야 한다.
			// 추상 클래스로는 객체 생성이 불가하다.
			// 사용 이유는 작업의 능률을 올리기 위해 효율적인 분담과
			// 전반적인 설계 틀을 만드는 데 사용된다.
	public static void main(String[] args) {
		// 01
//		Super1 ob1 = new Super1(); // 상위 클래스 객체 생성 O
//		Son1 ob2 = new Son1();	   // 하위 클래스 객체 생성 O
//		ob1.Func();				   // 상위 클래스에서 하위 클래스가 추가한 메서드 접근 X
//								   // 상위 클래스에서 정의한 메서드를 하위 클래스에서 재정의한 경우에는 접근 O
//		Super1 ob3 = ob2;		   // UpCasting
//		ob3.Func();

//		Super2 ob1 = new Super2(); // 추상클래스는 객체 생성이 불가하다
		Son2 ob2 = new Son2();	   // 추상클래스를 상속받는 클래스가 하위의 
								   // 모든 추상 메서드의 오버라이딩이 선언된다면 객체 생성이 가능하다
		Super2 ob3 = ob2;		   // (추상클래스) UpCasting O
		ob3.Func();
	}
}
