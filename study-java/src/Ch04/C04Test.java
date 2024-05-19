package Ch04;

import java.util.Scanner;

public class C04Test {
	
	public static void main(String[] args) {

		// next() 와 nextLine() 를 혼용할 때 주의할 점!
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(); // \n _
		double n2 = sc.nextDouble(); // \n _
		sc.nextLine();
		String str = sc.nextLine(); // \n

		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("str : " + str);

	}
}