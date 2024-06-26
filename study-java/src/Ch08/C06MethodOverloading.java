package Ch08;

class C06Simple {

	int sum(int x, int y) {
		System.out.println("int sum(int x , int y)");
		return x + y;
	}

	int sum(int x, int y, int z) {
		System.out.println("int sum(int x , int y , int z)");
		return x + y + z;
	}

	double sum(double x, int y, int z) {
		System.out.println("int sum(double x , int y , int z)");
		return x + y + z;
	}

	int sum(double x, double y, double z) {
		System.out.println("int sum(double x , double y, double z)");
		return (int) (x + y + z);
	}
	// 반환자료형은 오버로딩의 고려 대상이 아니다!
	// 자바 컴파일러가 메소드를 찾아낼때 메소드명과 매개변수의 형태로 구별을 한다
	// 따라서 아래의 메소드는 메소드 오버로딩이 아니다.
//	double sum(double x , double y,double z) {
//		System.out.println("int sum(double x , double y,double z)");
//		return x + y + z;
//	}
}

public class C06MethodOverloading {
	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		System.out.println(obj.sum(10, 20)); // 30
		System.out.println(obj.sum(10, 20, 30)); // 60
		System.out.println(obj.sum(10.1, 2, 2)); // 14.1
		System.out.println(obj.sum(10.5, 20.5, 30.5)); // 61
	}
}