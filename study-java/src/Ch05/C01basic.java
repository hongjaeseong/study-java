package Ch05;

import java.util.Scanner;

public class C01basic {

	public static void main(String[] args) {

		// 기본 산술 연산자

//		int a = 10, b = 20;
//		System.out.println("a + b = " + (a + b)); // a + b = 30
//		System.out.println("a - b = " + (a - b)); // a - b = -10
//		System.out.println("a * b = " + (a * b)); // a * b = 200
		// 나누기 - 몫
//		System.out.println("b / a = " + (b / a)); // b / a = 2
		// 나누기 - 나머지
		// 나머지 연산활용 : 1.짝홀수구분, 2.배수구분, 3.자리수제한, 4.끝자리구하기
//		System.out.println("a % b = " + (a % b)); // a % b = 10
//		System.out.println("-a = " + -a); // -a = -10

		// 문제
		// 두수를 입력 받아 두수의 합/차/곱을 출력하는 프로그램을 만들어보세요
		// Scanner 를 사용합니다
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt(); // 10 입력
//		int n2 = sc.nextInt(); // 20 입력
//		System.out.println("합 : " + (n1 + n2)); // 합 : 30
//		System.out.println("곱 : " + (n1 * n2)); // 곱 : 200
//		System.out.println("차 : " + (n1 - n2)); // 차 : -10

//		sc.close();

		// 대입연산자

		// LV = RV;
		// 공간 = 값(우선 처리);

		// 복합 대입 연산자 (산술 + 대입)
//		int a = 10;
//		a += 10; // a = a + 10;
//		System.out.println("a = " + a); // a = 20
//		a -= 5; // a = a - 5;
//		System.out.println("a = " + a); // a = 15
//		a *= 3; // a = a * 3;
//		System.out.println("a = " + a); // a = 45

		// 증감연산자

		// ++a(--a) : 전치 연산자 : 먼저 값 1증가(1감소) 이후 다른 연산자 처리
		// a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후 1증가(1감소)
//		int a = 10, b = 10, c, d = 0;

//		c = --a + b++;
//		d = a-- + ++b;
//		System.out.printf("a = %d, b = %d, c = %d, d = %d", a, b, c, d); // a = 8, b = 12, c = 19, d = 21

		// 비교연산자

//		int a = 10;
//		int b = 20;
//		System.out.println("A == B : " + (a == b)); // A == B : false
//		System.out.println("A != B : " + (a != b)); // A != B : true
//		System.out.println("A  > B : " + (a > b)); // A  > B : false
//		System.out.println("A  < B : " + (a < b)); // A  < B : true
//		System.out.println("A >= B : " + (a >= b)); // A >= B : false
//		System.out.println("A <= B : " + (a <= b)); // A <= B : true

		// 논리연산자
		// AND 연산자 '&&' : (true) && (true) = true , 그외는 거짓
		// OR 연산자 '||' : t || t = t, t || f = t, f || t= t, f || f = f
		// NOT 연산자 '!' : true 이면 false, false 이면 true

//		int a = 10;
//		int b = 20;
//		System.out.println((a >= b) && (a > 5)); // false
//		System.out.println((a != b) && (b > 15)); // true

//		System.out.println((a >= b) || (a > 5)); // true
//		System.out.println((a != b) || (b > 15)); // true
//		System.out.println((a == b) || (a <= 5)); // false
//		System.out.println(!(a == b)); // true

		// 논리부정연산자
//		boolean play = true;
//		System.out.println(play); // true

//		play = !play;
//		System.out.println(play); // false

//		play = !play;
//		System.out.println(play); // true

		// 삼항연산자
		// (조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;

//		int score = 85;
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
//		System.out.println(score + "점은 " + grade + "등급입니다."); // 85점은 B등급입니다.
		
	}
	
}