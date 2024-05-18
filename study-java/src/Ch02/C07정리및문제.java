package Ch02;

public class C07정리및문제 {

	public static void main(String[] args) {
//		정수 타입 		: byte, short, int,long
//		char 타입 	: char 
//		String 타입 	: String
//		실수 타입 		: double, float
//		논리 타입 		: boolean

//		확인 문제1

//		정수타입 
//		1byte : byte
//		2byte : char / short
//		4byte : int (기본자료형)
//		8byte : long 

//		실수타입
//		4byte : float
//		8byte : double (기본자료형)

//		논리타입
//		1byte : boolean

//		확인문제2

//		맞는 코드인지 틀린 코드인지 확인 
//		byte var1 = 200;							// ( x ) int로 저장 -> byte(-128 ~ 127) 오버플로우
//		char var2 ='AB';							// ( x ) char : 한 문자형 
		char var3 = 65; // ( o )
		System.out.println(var3); // A
//		long var4 = 50000000000;					// ( x ) int로 저장 불가 -> 오버플로우
		long var4a = 50000000000l; // ( o ) 리터럴 접미사로 long에 저장 -> 오버플로우 x
//		float var5 = 3.14;							// ( x ) double -> float 불가
		double var6 = 100.0; // ( o )
//		String var7 = "나의직업은 "개발자" 입니다.";		// ( x )
		String var7a = "나의직업은 \"개발자\" 입니다."; // ( o )
//		boolean var8 = 0;							// ( x ) int -> boolean 불가
//		int var9 = 1e2;								// ( x ) double -> int 불가 (지수는 실수 취급)
//		float = 1e2f;								// ( x ) 변수명 없음
	}

}
