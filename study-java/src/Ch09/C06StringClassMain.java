package Ch09;

import java.util.Arrays;
import java.util.Scanner;

public class C06StringClassMain {

	public static void main(String[] args) {
		
		String str1 = "Java Powerful";
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		//문자열 덧붙이는 작업 반복(StringBuffer , StringBuilder)
		StringBuffer str5 = new StringBuffer();
		System.out.println("-------------------");
		System.out.printf("%x\n", System.identityHashCode(str5)); // 574caa3f
		str5.append(str1).append(str2).append(str3).append(str4);
		System.out.printf("%x\n", System.identityHashCode(str5)); // 574caa3f
		System.out.println("-------------------");
		
		//문자열 확인
		System.out.println(str1); // Java Powerful
		System.out.println(str2); // java Programming
		System.out.println(str3); // Java Powerfuljava Programming
		System.out.println(str4); // Java Powerfuljava Programming
		//위치확인
		System.out.printf("%x\n", System.identityHashCode(str1)); // 880ec60
		System.out.printf("%x\n", System.identityHashCode(str2)); // 3f3afe78
		System.out.printf("%x\n", System.identityHashCode(str3)); // 7f63425a
		System.out.printf("%x\n", System.identityHashCode(str4)); // 36d64342
		//
		System.out.println("---------------------");
		System.out.println("문자열길이 : " + (str1.length())); // 문자열길이 : 13
		System.out.println("문자찾기 : " + (str1.charAt(0))); // 문자찾기 : J
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
		System.out.println("문자찾기 : " + (str1.indexOf("a")));
		System.out.println("문자찾기 : " + (str1.lastIndexOf("a")));
		
		System.out.println("문자포함여부 : " + (str1.contains("va")));
		System.out.println("문자포함여부 : " + (str1.contains("abs")));
		
//		Scanner sc = new Scanner(System.in);
//		String tmp =  sc.nextLine();
//		System.out.println(tmp.length());
//		System.out.println(tmp.trim().length());
		
		System.out.println("문자열자르기 : " + (str1.substring(2,6)));
		
		String str6 = "홍길동,남길동,서길동,동길동,길동길동";
		String[] result = str6.split(",");
		for(String val : result) {
			System.out.println(val);
		}
		
		
		
	}
}
