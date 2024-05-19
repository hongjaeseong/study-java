package Ch05;

import java.util.Random;
import java.util.Scanner;

public class C02PercentArith {

	public static void main(String[] args) throws InterruptedException {

		// % 연산자 활용

		// 01 짝홀수 구분
		// Scanner 객체 생성 후
		// 정수를 num1 에 저장 다음
		// 짝홀수 확인하세요

//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt(); // 2 입력

//		String result = (num1 % 2 == 0) ? "짝수입니다" : "홀수입니다";
//		System.out.println("결과 : " + result); // 결과 : 짝수입니다

		// 02 배수 구하기
		// 세 정수를 받아서 세 수의 합이 5의 배수인 경우
		// '5의 배수입니다'를 출력
		// 아닌 경우 '5의 배수가 아닙니다'를 출력

//		Scanner sc = new Scanner(System.in);
//		int n1, n2, n3, sum;
//		n1 = sc.nextInt(); // 2 입력
//		n2 = sc.nextInt(); // 3 입력
//		n3 = sc.nextInt(); // 5 입력
//		sum = n1 + n2 + n3;

//		String result = (sum % 5 == 0) ? "5의 배수입니다" : "5의 배수가 아닙니다";
//		System.out.println("RESULT : " + result); // RESULT : 5의 배수입니다

		// 03 수의범위
		// N % 2 = 0,1
		// N % 3 = 0,1,2
		// N % 4 = 0-3
		// N % 9 = 0-8
		// N % 10 = 0-9
		// N % 100 = 0 ~99

		// 난수 생성
//		Random rnd = new Random();

//		while (true) {
//			System.out.println(rnd.nextInt(5)); // N % 5 과 동일 (0~4)
//			Thread.sleep(500);
//		}

		// 02 Math.random();
//		while (true) {
//			System.out.println((int)(Math.random()*100)%16);
//			Thread.sleep(500);
//		}

		// 04 끝자리수구하기
//		int num = 56789;

//		System.out.println("오른쪽 끝 1자리 : " + (num % 10)); // 오른쪽 끝 1자리 : 9
//		System.out.println("오른쪽 끝 2자리 : " + (num % 100)); // 오른쪽 끝 2자리 : 89
//		System.out.println("오른쪽 끝 3자리 : " + (num % 1000)); // 오른쪽 끝 3자리 : 789
//		System.out.println("오른쪽 끝 4자리 : " + (num % 10000)); // 오른쪽 끝 4자리 : 6789
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 : " + (num / 10000)); // 왼쪽 끝 1자리 : 5
//		System.out.println("왼쪽 끝 2자리 : " + (num / 1000)); // 왼쪽 끝 2자리 : 56
//		System.out.println("왼쪽 끝 3자리 : " + (num / 100)); // 왼쪽 끝 3자리 : 567
//		System.out.println("왼쪽 끝 4자리 : " + (num / 10)); // 왼쪽 끝 4자리 : 5678

		// 정수 하나를 입력받아 거꾸로 저장해보세요(반복문법 이후 풀어보기)%,/연산 동시이용할 것
		// 예

//		입력: 1234
//		저장
//		int reverse = 4321;
//		출력 : 4321

	}

}