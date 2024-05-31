package Ch08;

class Car {
	private String modelName;
	private int modelYear;
	private int maxSpeed;

	Car(String modelName, int modelYear, int maxSpeed) {
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.maxSpeed = maxSpeed;
	}

	Car() {
		this("GLC Class", 2024, 150); // 다른 생성자 호출
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", modelYear=" + modelYear + ", maxSpeed=" + maxSpeed + "]";
	}
}

public class C08This {
	public static void main(String[] args) {
		Car Benz = new Car();
		System.out.println(Benz); // Car [modelName=GLC Class, modelYear=2024, maxSpeed=150]
	}
}
