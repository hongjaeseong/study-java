package Ch04;

//값입력 받기 Scanner 사용하기
import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {

		// new Scanner(System.in)
		// 키보드로 부터 전달되는 데이터를 받을 수 있는 Scanner 장치를 생성
		
		// System.out : 표준 출력 스트림 생성 - 모니터
		// System.in : 표준 입력 스트림 생성 - 키보드
		
		// Scanner sc = new Scanner(System.in);
		// Scanner 장치를 main 함수 내에서 제어(사용)할 수 있도록
		// 참조변수 'sc'와 연결한다.

		Scanner sc = new Scanner(System.in);
		
		// 입력단위 기준 : 개행(줄바꿈), 공백
		System.out.printf("num1 입력 : ");
		int num1 = sc.nextInt(); // 1 입력
		System.out.printf("num2 입력 : ");
		int num2 = sc.nextInt(); // 2 입력
		System.out.printf("num3 입력 : ");
		int num3 = sc.nextInt(); // 3 입력
		System.out.printf("num4 입력 : ");
		int num4 = sc.nextInt(); // 4 입력
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4, sum); // 1 + 2 + 3 + 4 = 10
		
		sc.close();

	}

}