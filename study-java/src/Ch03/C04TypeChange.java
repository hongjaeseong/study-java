package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {

		// 정수 연산식 (int 보다 작은 변수자료형(short, char , byte))
		// int 로 자동 형변환
		byte x = 10;
		byte y = 20;
//		byte result1 = x + y; // 컴파일 에러 발생!
		// 'x + y'의 결과가 int형으로 자동 형변환되기 때문
		// 산술 연산자인 '+'를 사용하면 피연산자가 byte형이라도 그 결과는
		// 자동으로 int형으로 변환된다. 따라서 타입 불일치로 컴파일 에러가 발생한다.
		// 오류 해결 방법
		byte result1 = (byte) (x + y);
		int result2 = x + y;
		System.out.println(result1); // 30
		System.out.println(result2); // 30

		// 정수 연산식 (int 보다 큰 변수자료형(long))
		// 큰 타입으로 자동 형변환
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
//		int result3 = var1 + var2 + var3;				
		// 오른쪽 변수들은 long으로 자동형변환
		// 연산의 결과는 가장 큰 자료형으로 승격된다.
		// but 왼쪽 공간이 작은 공간(int)이기 때문에 컴파일 에러 발생
		long result4 = var1 + var2 + var3;
		System.out.println(result4); // 1110

		// 실수연산식
		// 큰 타입으로 자동 형변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
//		int result5 = intvar + flvar + dbvar; // 컴파일 에러 발생!
		// 오른쪽 연산의 결과가 double형으로 자동 형 변환되어서 result5에 저장
		// 연산의 결과는 가장 큰 자료형으로 승격된다.
		// but 왼쪽 공간이 작은 공간(int)이기 때문에 컴파일 에러 발생한다.
		double result6 = intvar + flvar + dbvar;
		System.out.println(result6); // 18.800000190734863

	}

}