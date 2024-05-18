package Ch02;

public class C08Practice {
	
	public static void main(String[] args) {
		
		byte a = 'a';
		char b = '가';
		System.out.println(a); // 97
		System.out.println(b); // 가
		
		short c = (short)'가';
		char d = '가';
		System.out.printf("%d\n",(int)c); // -21504
		System.out.printf("%d\n",(int)d); // 44032
		System.out.printf("%x\n",(int)'가'); // ac00
		System.out.printf("%d\n",(int)'가'); // 44032
		
		int num = 0b0011000100110001;
		System.out.printf("%d\n", num); // 12593
		System.out.printf("%c\n", (char)num); // ㄱ
		System.out.printf("%c\n", (char)12593); // ㄱ 
		
	}
	
}
