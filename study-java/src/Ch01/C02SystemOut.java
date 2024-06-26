package Ch01;

public class C02SystemOut {

	public static void main(String[] args) {

		// System : OS
		// System.out : OS가 관리하는 표준 출력 스트림

		// System.out.print()
		// ESCAPE문자 :
		// \n : 개행,줄바꿈
		// \b : 백스페이스
		// \t : 탭길이(기본 8칸) 만큼 커서이동
		System.out.print("HELLO WORLD\n");		// HELLO WORLD
		System.out.print("HELLO WORLD\n");		// HELLO WORLD
		System.out.print("HELLO WORLD\n");		// HELLO WORLD
		System.out.print("HE\tLLOW\tORLD\n");	// HE	LLOW	ORLD

		// System.out.printf()
		// format : 형식,서식
		// %d : 10진수 정수 서식문자
		// %f : 10진수 실수 서식문자
		// %c : 한문자 서식문자
		// %s : 문자열 서식문자
		System.out.printf("%d %d %d \n", 10, 20, 30);		// 10 20 30 
		System.out.printf("%f %f %f \n", 10.1, 20.1, 30.1);	// 10.100000 20.100000 30.100000 
		System.out.printf("%c %c %c \n", 'A', 'B', 'C');	// A B C 
		System.out.printf("%s %s %s \n", "This is", " String ", "Test");	// This is  String  Test 
		System.out.printf("%d.%s : %d\n", 1, "국어", 100);	// 1.국어 : 100

		
		// System.out.println()
		System.out.println("HELLO WORLD");		// HELLO WORLD
		System.out.println("HELLO WORLD");		// HELLO WORLD
		System.out.println("HELLO WORLD");		// HELLO WORLD
		System.out.println("I Say \"HELLO\"");	// I Say "HELLO"

	}

}
