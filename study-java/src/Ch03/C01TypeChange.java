package Ch03;

public class C01TypeChange {

	public static void main(String[] args) {
		// (자료)형변환
		// 연산시 일치하지 않는 자료형을 일치시키는 작업

		// 자동형변환(암시적 형변환) : 컴파일러에 의해 자동 형변환
		// 강제형변환(명시적 형변환) : 프로그래머에 의해 강제 형변환

		// 자동형변환(=)
		// 작은값이 범위가 넓은 공간에 대입되는 경우
		// byte > short, char > int > long > float > double

		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue); // intValue: 10

		char charValue = '가';
		intValue = charValue;
		System.out.println("가 의 유니코드: " + intValue); // 가 의 유니코드: 44032

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue); // longValue: 50

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue); // floatValue: 100.0

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue); // doubleValue: 100.5

	}

}