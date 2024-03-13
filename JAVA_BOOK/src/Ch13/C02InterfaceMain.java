package Ch13;

interface Remocon {
	int MAXVOL=100;
	int MINVOL=0;
	void on();
	void off();
	void setvolumn(int vol);
}

interface Browser {
	void SearchURL(String url);
	
}
class TV implements Remocon {
	private int vol;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setvolumn(int vol) {
		if(vol>=MAXVOL) {
			this.vol = MAXVOL;
		}
		else if(vol<=MINVOL) {
			this.vol = MINVOL;
		}
		else {
			this.vol=vol;
		}
		System.out.println("현재 Volumn : " + this.vol);
		
	}
	
}

class Radio implements Remocon {
	private int vol;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 켭니다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 끕니다.");
	}

	@Override
	public void setvolumn(int vol) {
		if(vol>=MAXVOL) {
			this.vol = MAXVOL;
		}
		else if(vol<=MINVOL) {
			this.vol = MINVOL;
		}
		else {
			this.vol=vol;
		}
		System.out.println("현재 Volumn : " + this.vol);
	}
		
	}
class SmartTv extends TV implements Browser {

	@Override
	public void SearchURL(String url) {
		System.out.println(url + "로 이동합니다");
	}
}
	
public class C02InterfaceMain {
	
	public static void TurnOn(Remocon remocon) { // 참조 변수를 Remocon Interface로 설정
		remocon.on();
	}
	public static void TurnOff(Remocon remocon) { // 참조 변수를 Remocon Interface로 설정
		remocon.off();
	}
	public static void Volumn(Remocon remocon, int vol) {
		remocon.setvolumn(vol);
	}
	public static void BrowserSearch(Browser searchUrl, String url) {
		searchUrl.SearchURL(url);
	}
	public static void main(String[] args) {
		TV tv1 = new TV();			// tv1 객체 생성
		Radio radio1 = new Radio(); // radio1 객체 생성
		SmartTv smartTv = new SmartTv(); // smartTv 객체 생성

		
		// TV,Radio 클래스가 Remocon Interface를 구현하고 있기 때문에
		// TV,Radio 클래스로 객체를 만들면 Remocon Interface를 인자로 받는
		// TurnOn, TurnOff 함수를 사용할 수 있다.		
//		TurnOn(tv1);
//		TurnOff(tv1);
//		TurnOn(radio1);
//		TurnOff(radio1);
//		Volumn(tv1,50);
//		Volumn(radio1,105);
		TurnOn(smartTv);
		Volumn(smartTv,50);
		BrowserSearch(smartTv,"www.naver.com");
		TurnOff(smartTv);
		
	}
}

