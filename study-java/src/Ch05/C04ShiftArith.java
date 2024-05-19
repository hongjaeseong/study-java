package Ch05;

public class C04ShiftArith {

	public static void main(String[] args) {

		int num1 = 15; // 00000000 00000000 00000000 00001111
		int num2 = num1 << 3; // 00000000 00000000 00000000 01111000
		int num3 = num1 >> 3; // 00000000 00000000 00000000 00000001

		System.out.println("<<Shift 연산결과 : " + num2); // <<Shift 연산결과 : 120
		System.out.println(">>Shift 연산결과 : " + num3); // >>Shift 연산결과 : 1

	}

}