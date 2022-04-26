package inheritance;

class Car {
	
	public int speed;
	
	public void upSpeed(int speed) {
		this.speed += speed;
		
		System.out.println("현재속도(Car클래스): " + this.speed);
	}
	
}


// Car 클래스를 상속받는 Genesis 클래스를 만들어 
// upSpeed 메소드를 재정의 하기 (속도는 제한속도 200)

class Genesis extends Car {
	
	@Override
	public void upSpeed(int speed) {
		super.speed += speed;
		if(super.speed > 200) {
			super.speed = 200;
		}
		System.out.println("현재속도(Genesis클래스): " + super.speed);
	}
}


//Car 클래스를 상속받는 Porter 클래스를 만들어 
//upSpeed 메소드를 재정의 하기 (속도는 제한속도 150)

class Porter extends Car {
	
	@Override
	public void upSpeed(int speed) {
		super.speed += speed;
		if(super.speed > 150) {
			super.speed = 150;
		}
		System.out.println("현재속도(Porter클래스): " + super.speed);
	}
}




public class Ex01 {

	public static void main(String[] args) {

		Car car = new Car();
		Genesis genesis = new Genesis();
		Porter porter = new Porter();
		
		car.upSpeed(300);
		genesis.upSpeed(300);
		porter.upSpeed(300);
	}

}
