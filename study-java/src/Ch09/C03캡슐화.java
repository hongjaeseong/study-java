package Ch09;

import Ch08.C01Main;


//라면
class 라면Recipe{
	//순서
	private void step1() {System.out.println("1. 물을 끓인다");}
	private void step2() {System.out.println("2. 스프를 넣는다");}
	private void step3() {System.out.println("3. 면을 넣는");}
	private void step4() {System.out.println("4. 3~4분 후 불을 끈다");}
	
	//기능묶기
	public void Cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}
//요리사
class Cook{
	public 라면Recipe recipe01;
	Cook(){
		recipe01 = new 라면Recipe();
	}
}

public class C03캡슐화 {
	public static void main(String[] args) {
		Cook hong = new Cook();
		hong.recipe01.Cooking();
		
	}
}




