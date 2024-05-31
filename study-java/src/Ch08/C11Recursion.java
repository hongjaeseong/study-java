package Ch08;

import java.util.Scanner;

public class C11Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println(sum(n));
		System.out.println(recursiveSum(n));

	}
	// 재귀 호출을 사용하지 않고 1부터 n까지의 합을 구하기
	static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}
	// 재귀 호출을 사용해서 1부터 n까지의 합을 구하기
	// * 1부터 4까지의 합을 구하는 알고리즘
	// 1부터 4까지의 합은 1부터 3까지의 합에 4를 더하면 된다.
	// 1부터 3까지의 합은 1부터 2까지의 합에 3를 더하면 된다.
	// 1부터 2까지의 합은 1부터 1까지의 합에 2를 더하면 된다.
	// 1부터 1까지의 합은 그냥 1이다.
	// * 의사 코드
	// 시작
	//  1. n이 1이 아니면, n과 1부터 (n-1)까지의 합을 더한 값을 반환함.
	//  2. n이 1이면, 그냥 1를 반환함.
	// 끝
	static int recursiveSum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + recursiveSum(n - 1);
	}

}
