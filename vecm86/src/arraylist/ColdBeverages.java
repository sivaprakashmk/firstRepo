package arraylist;

public class ColdBeverages {
	
	String brand;
	double price;
	
	ColdBeverages(){
	}
	
	ColdBeverages(String brand,double price){
		this.brand = brand;
		this.price = price;	
	}
	
	public String toString() {
		return "brand :"+brand+",price"+price;
		
	}
}
