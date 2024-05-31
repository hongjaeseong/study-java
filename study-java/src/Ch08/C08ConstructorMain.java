package Ch08;

class C08Simple {
	// 멤버 변수
	int n1;
	double n2;
	boolean n3;
	String n4;

	// 생성자
	public C08Simple() {
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

	@Override
	public String toString() {
		return "C08Simple [n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + "]";
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
		System.out.println(ob5); // C08Simple [n1=111, n2=222.4, n3=false, n4=hong]
	}
}