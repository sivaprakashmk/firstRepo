package arraylist;

public class Snacks {
	
	String name;
	String kg;
	double price;
	
	Snacks(){}
	
	Snacks (String name,String kg,double price ){
		this.name=name;
		this.kg=kg;
		this.price=price;
	}
	
	public String toString() {
		return "name;"+name+ ",kg"+kg +",price"+price;
	}
	
}
