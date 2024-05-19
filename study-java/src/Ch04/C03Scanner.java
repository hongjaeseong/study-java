package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {

		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요? ");
		String name = sc.nextLine(); // 홍길동

		System.out.printf("%s 님의 나이를 입력하세요? ", name);
		int age = sc.nextInt(); // 28
		sc.nextLine();
		System.out.printf("%s 님의 주소를 입력하세요? ", name);
		String addr = sc.nextLine(); // 대구 북구 구암동

		System.out.printf("%s 님의 나이는 %d세, 주소는 %s 입니다", name, age, addr); // 홍길동 님의 나이는 28세, 주소는 대구 북구 구암동 입니다

	}

}