
package Ch02;

public class C04자료형 {

	public static void main(String[] args) {

		// 정수형 타입

		// int - 4byte (부호 o) (-2,147,483,648 ~ 2,147,483,647)
		// --------------------
		int n1 = 0b10101101; // 2진수값
		int n2 = 173; // 10진정수값
		int n3 = 0255; // 8진수
		int n4 = 0xad; // 16진수
		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4); // 173 173 173 173
		System.out.println(0b10101101); // 173
		// 상단 코드의 출력결과가 음수가 아닌 이유
		// 자바에서 이진수 리터럴은 기본적으로 'int'형으로 해석된다.
		// 'int'는 32비트 정수형이며 최상위 비트가 부호 비트로 사용되기 때문에
		// 음수로 해석하지 않는다.
		// 강제형변환을 통해 음수로 표현
		System.out.println((byte) 0b10101101); // -83
		System.out.println(Integer.toBinaryString(-129)); // 11111111111111111111111101111111
		// Integer.toBinaryString() : 주어진 정수를 부호 없는 32비트 이진수 문자열로 반환
		// 음수일 경우, 2의 보수 표현으로 결과를 반환

		// byte - 1byte (부호 o) (-128 ~ 127)
		// --------------------
		byte n5 = -128;
		byte n6 = -30;
		byte n7 = 30;
		byte n8 = 127;
		System.out.printf("%d %d %d %d\n", n5, n6, n7, n8); // -128 -30 30 127
		byte n9 = (byte) -129; // 강제 형변환
//		byte n10 = 129;			// 오버플로우로 인해 컴파일에러 발생
		System.out.printf("%d\n", n9); // 127 // 데이터 손실 발생

		// short - 2byte (부호 o) (-32,768 ~ 32,767)
		// char - 2byte (부호 x, 양수만) (0 ~ 65535)
		// --------------------
		short n11 = 32767;
		char n12 = 65535;
		char n13 = 60000;
		System.out.printf("%d %d %d\n",n11,(int)n12,(int)n13); // 32767 65535 60000
		// 'char'값을 정수로 출력하려면 'int'형 변환을 사용하여 해당 유니코드의 정수 값을 출력한다.
//		short n14 = n13; // 오버플로우로 인해 컴파일에러 발생
		short n14 = (short)n13; // 강제 형변환
		System.out.printf("%d\n",n14); // -5536 // 데이터 손실 발생

		// long - 8byte (부호 o)
		// --------------------
		long n15 = 10;
		long n16 = 20;	//L,l (리터럴접미사) : long 자료형 사용하여 값 저장 
		long n17 = 10000000000L;
		long n18 = 10000000000L;

		
		// 실수형 타입
		
		// 유리수와 무리수의 통칭
		// 소숫점이하값을 가지는 수 123.456
		// float - 4byte (6자리까지 오차없이 표현)
		// doblue - 8byte (15자리까지 오차없이 표현), 기본자료형

		// 정밀도 확인
		float n19 = 0.123456789123456789F; // f,F: 리터럴 접미사
		double n20 = 0.123456789123456789; // d,D: 리터럴 접미사(생략가능)
		
		System.out.println(n19); // 0.12345679
		System.out.println(n20); // 0.12345678912345678

		// 문자형 타입
		
		// 단일문자 char - 2byte
		// --------------------
		char ch1 = 'a';
		System.out.println(ch1); // a
		System.out.println((int)ch1); // 97
		
		char ch2 = 98;
		System.out.println(ch2); // b
		System.out.println((int)ch2); // 98
		
		char ch3 = 'b'+1;
		System.out.println(ch3); // c
		System.out.println((int)ch3); // 99
		
		byte ch4 = 'c'+2;
		System.out.println((char)ch4); // e
		System.out.println(ch4); // 101

		char ch5  = 0xac00;
		char ch6 = 44032;
		System.out.println(ch5); // 가
		System.out.println(ch6); // 가
		System.out.println((char)(0b1010110000000000+1)); //각

		char ch7 = 0xac00+1;
		System.out.printf("%c %c\n", ch6,ch7); // 가 각
		
		// \\u :유니코드값 이스케이프문자
		System.out.printf("%c\n", '\uACa1'); // 겡
		System.out.printf("TEST : %c\n", '\uabcd'); // TEST : ꯍ

		char n = 10;
		System.out.printf("HELLO %c WORLD", n); // 10 : enter
		System.out.println();
		// HELLO 
		//  WORLD
		
		// 논리형 타입
		
		// boolean - 1byte (true/false 저장)
		// --------------------
		boolean flag = (10>11); // false
		if(flag) {
			System.out.println("참인경우 실행");
		} else {
			System.out.println("거짓인경우 실행");
		}
		
		// 기본 자료형 (원시타입)
		byte a1;
		short a2;
		double a3;
		long a4;
		int b1 = 10;
		byte b2 = 20;
		char b3 = 40;
		
		// 클래스자료형
		// 클래스자료형으로 만든변수는 '참조변수'라고 하고
		// 참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		
		// 문자열 String (클래스자료형)
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name); // 홍길동
		System.out.println(job); // 프로그래머


	}

}
