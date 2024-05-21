package Ch08;

class C03Person {
	String name;
	int age;
	float height;
	double weight;

	void talk() {
		System.out.println(this.name + " 이 말합니다.");
	}
	void walk() {
		System.out.println(this.name + " 이 걷습니다.");
	}
	void showInfo() {
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}

public class C03PersonMain {

	public static void main(String[] args) {

		C03Person hong = new C03Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.4;
		hong.talk(); // 홍길동 이 말합니다.
		hong.walk(); // 홍길동 이 걷습니다.
		hong.showInfo(); // 홍길동 55 177.500000 70.400000
		System.out.println("-----------------");
		System.out.println(hong); // C03Person [name=홍길동, age=55, height=177.5, weight=70.4]

	}

}