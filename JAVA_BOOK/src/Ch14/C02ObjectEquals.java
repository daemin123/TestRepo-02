package Ch14;

// equals 재정의를 하지 않으면
// 객체간의 동등여부를 판단하기 힘듬
// 재정의를 하지 않으면 주소로 동등여부 판단

class C02Simple {
	int n;
	C02Simple(int n) {
		this.n=n;
	}
	@Override
	public boolean equals(Object obj) { // Object obj --> UpCasting
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple) obj; // DownCasting
			return this.n==down.n;
		}
		return false;
		
	}
}
public class C02ObjectEquals {
	
	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		
		String str1 = new String("Java");
		String str2 = new String("Java");
		System.out.println();
		
	}
}
