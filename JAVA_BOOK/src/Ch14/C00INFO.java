package Ch14;

public class C00INFO {
	// 절차지향 -> *순서*대로 진행(특정 문법을 만나면 무시하는 경우도 있음)
	// 절차지향의 핵심 -> 데이터의 저장과 처리(고정,동적)
	// 데이터 타입의 구분 (숫자,문자)
	// int 자료형에 문자 저장 가능 => 단일 문자는 수로 취급하기에
	// 자료형을 넘어가는 데이터값을 삽입시에 데이터 손실 발생
	// 연산처리 -> 형변환이 일어난다(자동,강제)
	// 표준 입출력(Scanner,print)
	// 연산자 (+,-,*,/,+=,-=,=-,=+,*=,=*,/=,=/...)
	// 연산자를 통해 분기처리 / 반복 --> 조건식 정의가 가능하기에
	
	// 객체 지향
	// 객체는 속성과 기능으로 구성
	// 클래스는 객체를 만들기 위한 기본 틀
	// 생성자, 일반 메서드, 함수의 4형태
	// Getter and Setter
	// private로 가려진 변수에 대해
	// 수정, 출력이 가능하게끔 로직을 만든다.
	
	// 정보 은닉
	// private 동일,다른 패키지에서 사용 불가
	// public 동일,다른패키지에서 사용 가능
	// protected 상속 관계에서만 사용 가능
	// default 동일 패키지에서만 사용 가능
	// final final로 선언된 변수는 더 이상 변경이 불가
	// 		 final로 선언된 클래스는 객체 생성 불가
	//		 final로 선언된 메소드는 오버라이딩 불가
	// static 전체 영역을 나타내는 변수
	// static으로 선언된 변수, 메소드는 어디서든지 사용 가능
	
	// 오버로딩(인자의 수에 따라 함수 명을 같게하고 다른 로직 가능)
	// 오버라이딩(상속관계를 전제로 상위 클래스의 함수를 하위 클래스에서 재정의 가능)
	// 상속(상위 클래스의 속성과 기능들을 하위 클래스에서 사용이 가능)
	// extends 'class name'으로 설정 가능
	// Casting -> 객체의 형변환
	// UpCasting -> 참조 변수의 무분별한 사용을 막고, 코드 중복을 막기 위해
	// DownCasting -> 상위 클래스보다 확장된 하위 클래스의 메소드와 변수를 상위 클래스로 선언된 객체가 사용하기 위해
	//				  상위 클래스로 선언된 객체를 강제로 하위 클래스형으로 형변환
	// 추상 클래스 -> 정의되어 있지 않고 선언만 되어 공간만 형성된 메소드, 변수를 갖고 있는 클래스
	// 			-> 추상 클래스를 상속받은 하위 클래스에서 반드시 메소드, 변수를 정의해줘야함.
	
	
	// 인터페이스 -> 추상화된 메소드, 변수만을 가지고 있는 집합체
	//	 		  implements로 인터페이스를 받은 클래스가 구현을 시켜줘야
	//	 		  추상화된 메소드를 사용이 가능하다.
	// 			  인터페이스는 다중 상속이 가능하다 => 클래스는 다중 상속이 불가능함
	// 			  ex) class A implements B,C
	//			  ex) class A extends B,C ==> 사용 불가
	
	// 자바 API의 구조
	// lang and util --> java.lang , java.util
	// 자바 언어의 주요 구성 요소
	// Math --> java.math , java.lang.Math
	// 각종 수학 계산과 관련된 클래스 및 유틸리티
	//* Collections --> java.util
	// 다양한 자료구조를 동일한 방법으로 처리할 수 있도록 하는 라이브러리
	// Input/Output --> java.io , java.nio , java.net
	// 키보드, 네트워크, 파일 등 입출력 관련 주요 기능을 제공하는 라이브러리
	//* Date and Time --> java.util , java.text
	// 시간 및 날짜 처리 관련 라이브러리
	// Networking --> java.net
	// 네트워크 통신 프로그래밍 관련 라이브러리
	// Swing/AWT --> java.swing , java.awt , javax.swing
	// 그래픽 사용자 인터페이스 구현 관련 라이브러리
	//* JDBC --> java.sql
	// 데이터베이스 프로그래밍 관련 라이브러리
	
	// 자바의 최상위 클래스? --> Object 클래스
}
