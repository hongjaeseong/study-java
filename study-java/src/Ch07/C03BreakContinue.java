package Ch07;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {

		// do - while 문
//		int i = 1, j = 1;
//		
//		do {
//			System.out.println("do / while 문이 " + i + "번째 반복 실행중입니다.");
//		} while (j < 1);
//		System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");

		// 1 break
		// -1을 입력하기 전까지 계속 정수값을 받아 누적 합을 출력
//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum=0;
//		while(true)
//		{
//			n=sc.nextInt();
//			if(n==-1) {
//				break;
//			}
//			sum+=n;
//		}
//		System.out.println("SUM = " + sum);

		// flag를 이용한 전체 반복문 탈출
//		int dan = 2;
//		int i = 1;
//		boolean isExit = false;
//		while (dan <= 9) {
//			i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				if (dan == 7 && i == 7) {
//					isExit = true;
//					break;
//				}
//				i++;
//			}
//			if (isExit == true)
//				break;
//			System.out.println();
//			dan++;
//		}

//		int dan = 2;
//		int i = 1;
//		Exit: while (dan <= 9) {
//			i = 1;
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//				if (dan == 7 && i == 7) {
//					break Exit;
//				}
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		// 'Exit: '는 'while (dan <= 9)' 반복문에 레이블을 지정한다.
		// 'break Exit;'는 'Exit' 레이블이 붙어 있는 바깥쪽 반복문까지 바로 종료한다.

		// 2 continue
		// 1부터 100까지의 정수 중에서 5의 배수와 7의 배수를 모두 출력
//		for (int i = 1; i <= 30; i++) {
//			if (i % 5 == 0 || i % 7 == 0) {
//				System.out.println(i);
//			} else {
//				continue;
//			}
//		}
		
		
		// 1부터 10까지의 수중에 3의 배수를 제외한 합 출력

//		int i = 1;
//		int sum = 0;
//		while (i <= 10) {
//			if (i % 3 == 0) {
//				i++;
////				continue; // 근접한 반복문의 조건식으로 돌아감
//			}
//			System.out.println("i = " + i);
//			sum += i;
//			i++;
//
//		}
//		System.out.println("SUM = " + sum);

	}

}