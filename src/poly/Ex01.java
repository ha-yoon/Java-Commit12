package poly;


class Parent {

	int money = 1000;
	
	public void moneyPrint() {
		System.out.println("money: " + this.money);
	}
}

class Child extends Parent {
	
	int money = 500;
	
	@Override
	public void moneyPrint() {
		System.out.println("money: " + this.money);
	}
}



public class Ex01 {

	public static void main(String[] args) {
	
		Parent poly = new Child(); 
		
		System.out.println("poly.money: " + poly.money);
		System.out.println();
		
		Child poly2 = (Child)poly; 
		System.out.println("poly2.money: " + poly2.money);
		
		Parent poly3 = poly2; 
		System.out.println("poly3.money: " + poly3.money);
		
		poly3.moneyPrint();
		
		
	}

}
