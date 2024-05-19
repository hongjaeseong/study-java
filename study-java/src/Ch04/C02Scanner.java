package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		sc.nextLine(); // 개행이 str3 에 담기지 않도록 개행만 입력시킴
		String str3 = sc.nextLine();
		String str4 = sc.nextLine();
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

//		String str = sc.next();
//		System.out.println(str);
		
//		String str1 = sc.next();
//		String str2 = sc.next();
//		String str3 = sc.next();
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt(); // 1 입력
//		System.out.println("입력된 정수 값 : " + num1); // 정수 입력 : 1
//
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble(); // 1.2 입력
//		System.out.println("입력된 실수 값 : " + num2); // 실수 입력 : 1.2
//
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next(); // hong 입력
//		System.out.println("입력된 문자열 : " + str1); // 입력된 문자열 : hong
//
//		System.out.print("입력 : "); // 입력 : hong jae seong
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n", s1, s2, s3); // 문자열 : hong jae seong

//		System.out.print("정수 입력 : ");
//		int num3 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num3);

//		sc.nextLine();
//		System.out.print("문자열 입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);

		// 주의 사항!!여러개의 값을 Scanner로 받을때

//		System.out.print("정수값 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.println("정수값 : " + n1);

//		System.out.print("실수값 입력 : ");
//		double n2 = sc.nextDouble();

//		// 여기서 문제발생!
//		System.out.print("문자열입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);

//		System.out.print("문자열입력 : ");
//		String str = sc.next();
//		System.out.println("문자열 : " + str);
		
		sc.close();

	}
}