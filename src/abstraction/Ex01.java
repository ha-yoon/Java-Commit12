package abstraction;

abstract class Hybrid { 
	 
	
	public int speed;
	
	public void upSpeed(int speed) {
		this.speed += speed;
	}
	
	abstract void run(); 
	
}

class Niro extends Hybrid {

	@Override
	void run() {
		System.out.println("니로가" + super.speed + "의 속도로 달린다.");
	}
	
}



public class Ex01 {

	public static void main(String[] args) {


		
		Hybrid niro = new Niro();
		niro.upSpeed(150);
		niro.run();
		

		Hybrid hybrid = new Hybrid() {
			
			@Override
			void run() {
				System.out.println("하이브리드는" + this.speed + "의 속도로 달린다.");
			}
		};
		
		hybrid.upSpeed(200);
		hybrid.run();
	}

}
