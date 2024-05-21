package Ch08;

import java.util.Scanner;

class MethodTest {
	public Scanner sc = new Scanner(System.in);

	public int sum1(int n1, int n2) {
		return n1 + n2;
	}
	public int sum2() {
		return sc.nextInt() + sc.nextInt();
	}
	public void sum3(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	public void sum4() {
		System.out.println(sc.nextInt() + sc.nextInt());
	}
}

public class C04MethodMain {
	public static void main(String[] args) {
		MethodTest sumCalc = new MethodTest();
		System.out.println(sumCalc.sum1(10, 20)); // 30
		System.out.println(sumCalc.sum2()); // 10 입력, 30 입력 // 40
		sumCalc.sum3(10, 20); // 30
		sumCalc.sum4(); // 10 입력, 30 입력 // 40
	}
}