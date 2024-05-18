package Ch03;

public class C07StringTypeChange {

	public static void main(String[] args) {

		// 문자열 + 문자열 -> 문자열
		System.out.println("문자열1" + "문자열2"); // 문자열1문자열2

		// 문자열 + 문자 -> 문자열 / 문자열 + 문자열 -> 문자열
		System.out.println("문자열1" + ',' + "문자열2"); // 문자열1,문자열2

		// 문자열 + 숫자 -> 문자열
		System.out.println("문자열1" + 2); // 문자열12
		System.out.println(2 + "문자열1"); // 2문자열1

		// 문자 + 문자 -> 정수형, 유니코드 값으로 연산 (결과 int형)
		System.out.println(',' + '!' + "문자열"); // 77문자열
		// ','(44) + '!'(33) -> 77 (int형)
		// 77 + "문자열" -> "77문자열"

		// 문자열 -> 숫자형 변환

		// 문자열 -> 숫자형으로 변환(정수)
//		int n1 = "10"; // 컴파일 오류 발생
		// 자바에서, 문자열을 정수타입 변수에 직접 할당 불가
		// 오류 해결
		String str = "10";
		int n = Integer.parseInt(str);
		System.out.println(n); // 10

		// 웹개발 코드 시 폼으로부터 전달받은 값은 다 문자열임
		int n2 = Integer.parseInt("10");
		int n3 = Integer.parseInt("20");
		System.out.println(n2 + n3); // 30

		// 변환이 성공적으로 이루어지기 위해서는 문자열이 유효한 정수 표현이어야 함
//		int n4 = Integer.parseInt("abc"); // NumberFormatException 오류 발생

		short n6 = Short.parseShort("5");
		short n7 = Short.parseShort("6");
		System.out.println(n6 + n7); // 11
		
		// 문자열 -> 숫자형으로 변환(실수)
		double n4 = Double.parseDouble("10.5");
		double n5 = Double.parseDouble("20.4");
		System.out.println(n4 + n5); // 30.9

		Float n8 = Float.parseFloat("10.2");
		Float n9 = Float.parseFloat("20.3");
		System.out.println(n8 + n9); // 30.5

		// 숫자형 -> 문자열 변환
		int value1 = 10;
		double value2 = 3.14;

		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);
		// 문자열 붙이기
		System.out.println(str1 + str2); // 103.14
		System.out.println(str2 + str1); // 3.1410
		
		String str3 = value1 + ""; // "" : 빈 문자열
		String str4 = value2 + "";
		// value1 + "" : 문자열 결합 연산자로 사용됨, 정수를 문자열과 결합하면 정수가 문자열로 변환됨

		// 문자열 붙이기
		System.out.println(str3 + str4); // 103.14 

	}

}