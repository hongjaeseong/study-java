package Ch08;

// 가변인자 vs 오버로딩
// 공 : 동일한 메소드명으로 다양한 매개변수의 형태로 메소드 호출 가능
// 차 : 단, 가변인자일 경우 동일한 타입(자료형)의 인자만 받을 수 있음
class Simple07 {
	int sum(int... arg) {
		for (int num : arg) {
			System.out.print(num + " ");
		}
		System.out.println();
		return 0;
	}
}

public class C07Method가변인자 {
	public static void main(String[] args) {
		Simple07 obj = new Simple07();
		obj.sum(10);
		obj.sum(11, 22);
		obj.sum(13, 23, 44);
//		obj.sum(13, 23, 44.5); // 가변인자를 매개변수로 사용해 인자를 받을 경우 다른 타입의 인자를 받을 수 없음
	}
}