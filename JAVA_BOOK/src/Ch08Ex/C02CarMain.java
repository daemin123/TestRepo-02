package Ch08Ex;

class C02Car{
	String owner;
	int speed;
	int fuel;
	void Accel() {
		System.out.println(this.owner + "님이 현재속도" + this.speed + "에서" + (this.speed+5) +"로 가속합니다");
		this.speed +=5;
	}
	void Break() {
		System.out.println(this.owner + "님이 현재속도" + this.speed + "에서" + (this.speed-5) +"로 감속합니다");
		this.speed-=5;
	}
	void ShowInfo() {
		System.out.println(this.owner + "," + this.speed + "," + this.fuel);
	}
}

public class C02CarMain {
	
	public static void main(String[] args) {
		// 다음 main함수의 코드가 실행될수있도록 C01Car 클래스를 만드세요
		C02Car hongCar = new C02Car();
		hongCar.owner = "홍길동";
		hongCar.speed = 0;
		hongCar.fuel = 100;
		hongCar.Accel(); //owner + 님이 현재속도 + speed +에서 (speed+5)로 가속합니다가 출력
		hongCar.Accel();
		hongCar.Accel();
		hongCar.Accel();
		hongCar.Accel();
		hongCar.Accel();
		hongCar.Break(); //owner + 님이 현재속도 + spped +에서 (spped-5)로 감속합니다가 출력
		hongCar.ShowInfo(); //owner, speed, fuel이 출력

	}

}
