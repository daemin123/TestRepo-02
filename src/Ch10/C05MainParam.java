package Ch10;

public class C05MainParam {
	
	public static void main(String[] args) {
		System.out.println("Length : " + args.length);
		for(String param : args) {
			System.out.println(param);
		}
	}
}
