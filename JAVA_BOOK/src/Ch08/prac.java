package Ch08;

class Car {
	String color;
	String size;
	String engine_state;
	
	void showAtts() {
		System.out.println("색상은" + this.color + "크기는 " + this.size + "엔진의 상태는 " + this.engine_state);
	}
	void startEngine() {
		this.engine_state = "시동";
		System.out.println(this.engine_state+ "합니다");
	}
	void stopEngine() {
		this.engine_state = "정지";
		System.out.println(this.engine_state+"합니다");
	}
}
public class prac {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "blue";
		myCar.size = "mid-size";
		myCar.engine_state = "정지";
		myCar.showAtts();
		myCar.startEngine();
		myCar.showAtts();
		myCar.stopEngine();
		
	}

}
