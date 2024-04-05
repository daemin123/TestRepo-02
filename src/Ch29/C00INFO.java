package Ch29;

public class C00INFO {
	//Reflect란
	//자바의 Reflection(리플렉션)은 실행 중인 프로그램의 클래스, 인터페이스, 메서드, 필드 등의 정보를 
	//동적으로 얻고 조작할 수 있는 기능을 제공하는 API입니다. 리플렉션을 사용하면 컴파일 시간에 알려지지 않은 
	//클래스에 대한 정보를 얻거나, 클래스의 메서드와 필드에 접근하고 호출할 수 있습니다. 이를 통해 자바의
	//객체 지향적 특성을 활용하여 유연하고 동적인 프로그램을 작성할 수 있습니다.

	//리플렉션을 사용하기 위해 java.lang.reflect 패키지에 있는 클래스와 인터페이스를 활용합니다. 
	//주요한 클래스와 메서드에 대한 간략한 설명은 다음과 같습니다:
	//
//		Class: 클래스의 메타데이터를 나타내는 클래스입니다. Class 객체를 통해 클래스의 이름, 필드, 메서드, 생성자 등의 정보를 얻을 수 있습니다.
//		Field: 클래스의 필드를 나타내는 클래스입니다. Field 객체를 통해 필드의 이름, 타입, 접근 제어자 등의 정보를 얻을 수 있으며, 필드의 값을 읽거나 수정할 수도 있습니다.
//		Method: 클래스의 메서드를 나타내는 클래스입니다. Method 객체를 통해 메서드의 이름, 매개변수 타입, 리턴 타입, 접근 제어자 등의 정보를 얻을 수 있으며, 메서드를 호출할 수도 있습니다.
//		Constructor: 클래스의 생성자를 나타내는 클래스입니다. Constructor 객체를 통해 생성자의 매개변수 타입, 접근 제어자 등의 정보를 얻을 수 있으며, 생성자를 호출하여 객체를 인스턴스화할 수도 있습니다.

	//리플렉션은 일반적인 자바 개발에서는 자주 사용되지 않지만, 프레임워크, 라이브러리, 
	//테스트 도구 등에서 동적인 환경에서의 프로그래밍이 필요한 경우 유용하게 사용될 수 있습니다. 
	//그러나 리플렉션은 성능 상의 이슈가 있으므로, 가능한 경우에는 정적인 방법으로 코드를 작성하는 것이 좋습니다.
}