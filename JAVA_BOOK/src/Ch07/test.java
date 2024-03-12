package Ch07;

import java.util.Scanner; // Scanner 함수를 사용하기 위한 Interface

public class test { 

	public static void main(String[] args) { // 메인 함수 영역 선언
 
		Scanner sc = new Scanner(System.in); // 입력을 받기위한 스캐너 함수 사용 선언
		System.out.println("높이를 입력하세요!"); // "높이를 입력하세요!" 문구 출력
		int n = sc.nextInt(); // 입력받을 변수를 정수형으로 제한
		int i=0; // 변수 i를 초기값 0인 상태로 선언
		int j=0; // 변수 j를 초기값 0인 상태로 선언
		int k=0; // 변수 k를 초기값 0인 상태로 선언
		while(i<n) // i가 n이랑 크기가 같아질 때까지 반복
		{
			//공백
			j=0; // j를 0으로 선언해 줘야 다음 while문에 들어올 때 j의 값이 0으로 초기화됨
			while(j<=n-i-2) { // 공백의 개수랑 들어오는 변수 n에 대하여 관계식을 세운다.
							  // (n-1)부터 0까지 들어가므로 (n-1)-i-1의 관계식을 도출할 수 있다.
				System.out.print(" "); // 공백 표현
				j++; // 반복문 탈출을 위한 변수 j의 증가
			}
			//별
			k=0; // k를 0으로 선언함으로써 상위 while문의 반복이 들어갈때 k가 0으로 초기화시켜줘야함
			while(k<=2*i) {  // 별의 개수는 1,3,5,7,...(2n-1)
							 // 관계식 2n-1+1 -- +1을 하는 이유는 k가 0부터 시작하기 때문
				System.out.print("*"); // 별 표현
				k++; // while문 탈출을 위한 조건식의 변수 k의 증가
			}
			System.out.println(); // 줄바꿈 표현
			i++; // 상위 while문을 탈출하기 위한 변수 i의 증가
		}
				

	}

}
