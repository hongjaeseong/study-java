package Ch03;

public class C08형변환정리및문제 {

	public static void main(String[] args) {

		// 정리

		// 1. 자동 타입 변환
		// 컴파일에 의한 자동 형변환
		// 큰 공간에 작은 자료형의 값을 넣을때 발생
		// 데이터 손실이 최소화되는 방향으로 자료형이 결정된다

		// 2. 강제 타입 변환
		// 프로그래머에 의한 강제 형변환
		// 작은 공간에 큰 자료형의 값을 저장 (데이터 손실발생)

		// - 문자열 결합 연산
		// 문자열과 '+' 연산을 하면 다른 피연산자도 문자열로 변환되어 문자열 결합이 일어난다

		// Integer.parseInt() : 문자열을 정수 int타입으로 변환
		// Double.parseDouble() : 문자열을 실수 double타입으로 변환

		// 문제
		// 1. 자동 타입 변환에 대한 내용이다. 컴파일 에러가 발생하는 것은 무엇입니까?

//		byte byteValue = 10;
//		char charValue = 'A';

//		int intValue = byteValue;
//		int intValue2 = charValue;
//		short shortValue = charValue; // 컴파일 에러 발생
//		double doubleValue = byteValue;

		// 2. 강제 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?

//		int intValue2 = 10;
//		char charValue2 = 'A';
//		double doubleValue2 = 5.7;
//		String strValue2 = "A";

//		double var1 = (double)intValue2;
//		byte var2 = (byte) intValue2;
//		int var3 = (int)doubleValue2;
//		char var4 = (char)strValue2; // 컴파일 에러 발생
		// 문자열을 char 타입으로 강제 형 변환 할 수 없음
		// String 객체를 char 타입으로 변환하려면 문자열에서 개별 문자를 추출해야 함
		// 에러 해결
//		char var4 = strValue2.charAt(0);
//		System.out.println(var4); // A

		// 3. 연산식에서의 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?

//		byte byteValue3 = 10;
//		float floatValue3 = 2.5F;
//		double doubleValue3 = 2.5;

//		byte result1 = byteValue3 + byteValue3; // 컴파일 에러 발생
		// '+'를 사용하면 피연산자가 byte 라도 결과는 int 형을 변환된다.
		// 오류 해결
//		byte result1 = (byte) (byteValue3 + byteValue3);
//		int result2 = 5 + byteValue3;
//		float result3 = 5 + floatValue3;
//		double result4 = 5 + doubleValue3;

		// 4. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해 보세요

//		short s1 = 1;
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		short result = s1 + s2; // 컴파일 에러 발생
		// '+'를 사용하면 피연산자가 short라도 결과는 int형을 변환된다.
		// 오류 해결
//		short result = (short) (s1 + s2);
//		int result12 = i1 + i2;

		// 5. 알파벳 a의 유니코드는 97이고 b의 유니코드는 98입니다.
		// 따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로
		// 다음과 같이 코드를 작성했습니다. 실행결과는 b가 출력되어야 하는데
		// 컴파일 에러가 발생하였습니다. 무엇이 문제이고, 어떻게 수정하면 좋을지 적어보세요

//		char c1 = 'a';
//		char c2 = c1 + 1; // 컴파일 에러 발생
		// '+'를 사용하면 피연산자중 가장 큰 형인 int형을 변환된다.
		// 따라서 작은 공간에 큰 값을 넣으려고 해서 컴파일 에러가 발생함
		// 오류 해결
//		char c2 = (char) (c1 + 1);
//		System.out.println(c2); // b

		// 6. 자바에서 '/'는 나눗셈 연산자 입니다 'x / y' 는 x를 y로 나누는 연산을 수행합니다
		// 빈칸에 들어갈 타입은 무엇이며 출력되는 결과와 그 이유를 설명해 보세요

//		int x = 5;
//		int y = 2;
//		int result = x / y;
		// '정수 / 정수'는 정수가 반환되며 데이터 손실이 발생한다.
//		System.out.println(result); // 2

		// 7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다 빈칸에 들어갈 코드를 작성하세요

//		int x1 = 5;
//		int y1 = 2;
//		double result1 = (double) x / y;
//		System.out.println(result1); // 2.5

		// 8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다
		// 빈칸에 들어갈 코드를 작성해 보세요

//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result8 = (int) (var1 + var2);
//		System.out.println(result8); // 6

		// 9. var1부터 var4까지 '+'연산을 수행해서 int타입 result변수에 9가 저장되도록
		// 빈칸에 들어갈 코드를 작성해보세요

//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		double var5 = Double.parseDouble(var4);

//		int result = (int) (var1 + (int) var2 + var3 + var5);
//		System.out.println(result); // 9

		// 10. 다음코드를 실행했을 때 출력 결과를 적어보세요

//		String str1 = 2 + 3 + "";
//		String str2 = 2 + "" + 3;
//		String str3 = "" + 2 + 3;
//		System.out.println(str1); // 5
//		System.out.println(str2); // 23
//		System.out.println(str3); // 23

		// 11. 문자열을 기본 타입으로 변환하려고 합니다
		// 빈칸에 알맞은 코드를 작성해 보세요

//		byte value = Byte.parseByte("10");
//		int value2 = Integer.parseInt("100");
//		float value3 = Float.parseFloat("20.5");
//		double value4 = Double.parseDouble("3.14159");

	}

}