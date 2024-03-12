package Ch08Ex;

class C06Computer {
	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	C06Computer(String SerialNo,String CPUSpec,String RAMSpec, String DISKSpec){
		this.SerialNo = SerialNo;
		this.CPUSpec = CPUSpec;
		this.RAMSpec = RAMSpec;
		this.DISKSpec = DISKSpec;
	}
	//SerialNo:String
	//CPUSpec : String
	//RAMSpec : String
	//DISKSpec : String
	//PowerON() : void 		SerialNo+의 전원을 켭니다 가 출력
	void PowerON() {
		System.out.println(this.SerialNo+"의 전원을 켭니다");
	}
	//PowerOFF() : void		SerialNo+의 전원을 끕니다 가 출력
	void PowerOFF() {
		System.out.println(this.SerialNo+"의 전원을 끕니다");
	}
	//ShowInfo() : void 	Computer객체의 모든 속성이 출력
	void ShowInfo() {
		System.out.println(this.SerialNo + "," + this.CPUSpec + "," + this.RAMSpec);
	}
}

public class C06Ex {

	public static void main(String[] args) {
		C06Computer LGGram1010 = new C06Computer("1010","I7","16G","2TB");
		LGGram1010.PowerON();
		LGGram1010.PowerOFF();
		LGGram1010.ShowInfo();

	}

}
