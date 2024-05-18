package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {

		int num1 = 10, num2 = 4;

		double dnum = num1 / num2;
		// 피연산자 num1, num2은 int형이기 때문에 연산 후에 소수점 데이터손실
		System.out.println(dnum); // 2.0

		double dnum1 = (double) num1 / num2;
		// 산술 연산을 할 때, 피연산자 중 하나가 double 타입이면
		// 다른 피연산자도 자동으로 double 타입으로 승격
		System.out.println("dnum1 : " + dnum1); // dnum1 : 2.5

		double dnum2 = (num1 * 1.0) / num2;
		// 나눌 수를 double형으로 강제 형 변환함으로써
		// 연산 후에 발생되는 소수점을 표현할 공간을 마련
		System.out.println("dnum2 : " + dnum2); // dnum2 : 2.5

	}
}