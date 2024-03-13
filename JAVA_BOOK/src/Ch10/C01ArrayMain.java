package Ch10;

import java.util.Arrays;
import java.util.Scanner;

// 배열
// 동일한 데이터타입의 여러 값들을 저장하기 위한 자료 구조
// 크기는 초기값으로 고정이기에 동적 확장 불가 ==> 컬렉션으로 대체 가능

// 1차원 (n) / 2차원 (n*m) / 다차원 (n*m*d*...)

public class C01ArrayMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr1 = new int[5];
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		System.out.println("------------------");
		System.out.println("배열 길이 : " + arr1.length);
		System.out.println("------------------");
		for(int i = 0; i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		int max = arr1[0];
		int min = arr1[0];
		for(int i = 0; i<arr1.length;i++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
			if(min>arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println();
		System.out.printf("MAX : %d\nMIN : %d",max,min);
		System.out.println();
		System.out.println(Arrays.stream(arr1).max().getAsInt());
		System.out.println(Arrays.stream(arr1).min().getAsInt());
		
		System.out.println(Arrays.stream(arr1).average().getAsDouble());
//		System.out.println();
//		System.out.println("------------------");
		
//		for(int val : arr1) {
//			System.out.println(val);
//		}
//		System.out.println("------------------");
		
//		Arrays.stream(arr1).forEach(item->System.out.println(item));
//		System.out.println("------------------");
//		Arrays.stream(arr1).forEach(System.out::println);
	}
}
