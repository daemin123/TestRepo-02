package Ch10Ex;

import java.util.Arrays;
import java.util.Scanner;

import Ch01.C02SystemOut;

public class C01Ex {
	public static void main(String[] args) {
		// 5개의 정수값을 입력받아 int형 배열에 저장하고
		// 최대값,최소값, 전체합을 출력
		int arr[] = new int [5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		
		System.out.println(Arrays.stream(arr).min());
		System.out.println(Arrays.stream(arr).max());
		System.out.println(Arrays.stream(arr).average());
	}
}
