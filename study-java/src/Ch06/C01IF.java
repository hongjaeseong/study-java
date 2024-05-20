
package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {

		// IF 문
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt(); // 12 입력
//
//		if (age >= 8) // 12 >= 8 -> true
//			System.out.println("학교에 다닙니다"); // 학교에 다닙니다
//
//		System.out.println("첫번째 IF 블럭 종료"); // 첫번째 IF 블럭 종료
//
//		if (age < 8) // 12 < 8 -> false
//			System.out.println("학교에 다니지 않습니다"); // 실행 x
//		System.out.println("두번째 IF 블럭 종료"); // 두번째 IF 블럭 종료

		// IF - ELSE
//		int age = 10;
//
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다"); // 학교에 다닙니다
//		} else {
//			System.out.println("학교에 다니지 않습니다"); // 실행 x
//		}
//		System.out.println("두번째 IF 블럭 종료"); // 두번째 IF 블럭 종료
//		System.out.println("프로그램을 종료합니다"); // 프로그램을 종료합니다

		// 입력값 받기 + if
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 1 입력 : ");
//		int num = sc.nextInt(); // 1 입력
//
//		if (num % 2 == 0) // 짝수 구분
//		{
//			System.out.println("입력한 값은 짝수 입니다");
//		} else {
//			System.out.println("입력한 값은 홀수 입니다"); // 입력한 값은 홀수 입니다
//		}

		// IF - ELSE IF - ELSE
		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 -
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		if (n % 3 == 0 && n % 5 == 0) {
//			System.out.println(n + " 은 3의 배수 이면서 5의 배수입니다.");
//		} else {
//			if (n % 3 != 0 && n % 5 == 0) {
//				System.out.println(n + " 은 3의 배수는 아니고 5의 배수입니다.");
//			} else if (n % 3 == 0 && n % 5 != 0) {
//				System.out.println(n + " 은 3의 배수이고 5의 배수는 아닙니다.");
//			} else {
//				System.out.println(n + " 은 3의 배수도 아니고 5의 배수도 아닙니다.");
//			}
//		}

		// 문제
		// 두수를 입력받아 두수 중에 큰수를 출력

//		int num1, num2;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1 정수 입력 :");
//		num1 = sc.nextInt();
//		System.out.print("2 정수 입력 :");
//		num2 = sc.nextInt();
//
//		if (num1 > num2) {
//			System.out.println("큰수 : " + num1);
//		} else {
//			System.out.println("큰수 : " + num2);
//		}
//		sc.close();

		// 문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력

//		int num1, num2, num3;
//		int sum = 0;
//		double avr = 0.0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("세 수를 입력하세요 : ");
//		num1 = sc.nextInt(); // 1 입력
//		num2 = sc.nextInt(); // 2 입력
//		num3 = sc.nextInt(); // 3 입력
//
//		sum = num1 + num2 + num3;
//		avr = (double) sum / 3;
//
//		System.out.println("합 :" + sum + " 평균 : " + avr); // 합 :6 평균 : 2.0

	}

}
