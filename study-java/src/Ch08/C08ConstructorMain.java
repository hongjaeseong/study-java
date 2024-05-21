package Ch08;

// 생성자메서드?
// 객체 생성시에 1회 호출되는 메서드
// 생성된 객체 내에서는 사용이 불가!
// 객체 생성시에 필요한 메모리공간 형성과 초기값 부여에 사용
// 생성자 함수는 클래스명과 동일하며 반환자료형을 가지지 않는다
// 생성자 함수를 클래스 내에 명시하지 않으면 컴파일러에 의해 디폴트 생성자 주입
// 디폴트 생성자는 모든 멤버변수의 초기값을 0 (or false or null)으로 지정

class C08Simple {
	int n1;
	double n2;
	boolean n3;
	String n4;

	public C08Simple() { // 생성자
		System.out.println("C08Simple() 호출!");
		this.n1 = 100;
		this.n2 = 200.2;
		this.n3 = true;
		this.n4 = "HI";
	}

	public C08Simple(int n1) {
		System.out.println("C08Simple(int n1) 호출!");
		this.n1 = n1;
	}

	public C08Simple(int n1, double n2) {
		System.out.println("C08Simple(int n1,double n2) 호출!");
		this.n1 = n1;
		this.n2 = n2;
	}

	public C08Simple(int n1, double n2, boolean n3) {
		System.out.println("C08Simple(int n1,double n2,boolean n3) 호출!");
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public C08Simple(int n1, double n2, boolean n3, String n4) {
		System.out.println("C08Simple(int n1,double n2,boolean n,String n4) 호출!");
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
}

public class C08ConstructorMain {
	public static void main(String[] args) {
		C08Simple ob = new C08Simple(); // C08Simple() 호출!
		System.out.printf("%d %f %b %s\n", ob.n1, ob.n2, ob.n3, ob.n4); // 100 200.200000 true HI
		C08Simple ob2 = new C08Simple(111); // C08Simple(int n1) 호출!
		C08Simple ob3 = new C08Simple(111, 222.4); // C08Simple(int n1,double n2) 호출!
		C08Simple ob4 = new C08Simple(111, 222.4, false); // C08Simple(int n1,double n2,boolean n3) 호출!
		C08Simple ob5 = new C08Simple(111, 222.4, false, "hong");
		// C08Simple(int n1,double n2,boolean n,String n4) 호출!
	}
}