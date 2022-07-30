package upanddowncast;

public class Mobile {
	
	String name;
	double price;
	
	Battary B1 = new Battary(6000);
	
	Mobile(String name, double price){
		this.name =name;
		this.price = price;
	}
	public void mobileAttributes() {
		B1.battaryAttributes();
		System.out.println("name :" +name);
		System.out.println("price :" +price);
		
	}

}
