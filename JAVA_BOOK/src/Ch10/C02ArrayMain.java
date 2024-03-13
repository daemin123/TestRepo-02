package Ch10;

import java.util.Arrays;

public class C02ArrayMain {
	public static void main(String[] args) {
		
		// 얕은 복사
		// Heap 영역에 만들어진 배열의 주소값을 복사
		// 동일 메모리 주소를 공유함으로
		// arr1[]에 대하여 요소의 값을 수정하면
		// arr2[]에도 값이 수정된다
		
		int arr1[] = {10,20,30};
		int arr2[];
		arr1[0] = 30;
		arr2 = arr1;
		Arrays.stream(arr1).forEach(item->System.out.print(item));
		System.out.println();
		Arrays.stream(arr2).forEach(item->System.out.print(item));
		System.out.println();
		
		// 깊은 복사
		// 메모리 주소를 복사하는게 아닌 안의 요소의 값을 복사
		int arr3[] = new int[3]; // 먼저 동일 크기의 배열을 저장하는 공간을 Heap 영역에 새로 생성
		for(int i = 0 ; i <arr3.length;i++) { // 값 복사
			arr3[i]=arr1[i];
		}
		int arr4[] =Arrays.copyOf(arr1, arr1.length); // arr1 배열을 arr1.length만큼 복사
		Arrays.stream(arr4).forEach(item->System.out.print(item));
		System.out.println();
		Arrays.stream(arr4).forEach(System.out::println);
		
		System.out.println("arr1 : " + arr1); // 메모리 주소값 출력
		System.out.println("arr2 : " + arr2); // 메모리 주소값 출력 
		System.out.println("arr3 : " + arr3); // 메모리 주소값 출력
		System.out.println("arr4 : " + arr4); // 메모리 주소값 출력
	}
}
