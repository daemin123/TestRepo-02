package Ch13;
// *다중 상속*
// 기본적으로 일반 클래스는 다중 상속이 안된다
// 인터페이스를 구현하여 다중 상속을 가능케 함
// 인터페이스는 다중 상속이 가능
// 클래스, 추상클래스는 불가능
// Why?
// 인터페이스는 실질적인 구현이 이루어지지 않고 메소드에 대한 선언만 하고 있다.


interface A {
	void a(); 
}

interface B {
	void a();
}

class C implements A,B {
	public void a() {
		System.out.println("AA");
	}
}

public class C04InterfaceMain {
	public static void main(String[] args) {
		
	}
}
