package poly;

class Run {
	
	int speed = 100;
	
	public void run() {
		System.out.println(speed + "의 속도로 달린다.");
	}
}

class Person extends Run {
	
	String name = "홍길동";
	
	public void walk() {
		System.out.println(name + "이 산책을 한다.");
	}
	
	@Override
	public void run() {
		System.out.println(name + "이" + speed + "의 속도로 달린다.");
		walk();
	}

class KiaCar extends Run {
	
	String model = "k5";
	
	public void parking() {
		System.out.println(model + "가 주차를 한다.");
	}
	
	@Override
	public void run() {
		System.out.println(model + "가" + speed + "의 속도를 달린다.");
		parking();
	}
}
	
}


public class Ex02 {

	public static void main(String[] args) {

		Run run = new Person();
		System.out.println(run.speed);

		
		run.run();

		
		run = new Run(); 
		
		
		run.run();
	}

}
