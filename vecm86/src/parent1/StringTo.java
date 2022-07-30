package parent1;

public class StringTo {
	String place;
	int pincode;

	StringTo(){}
	
	StringTo(String place ,int pincode){
		this.place=place;
		this.pincode=pincode;
	}
	
	public String toString() { 
		return " place :"+place +", pin : "+pincode; 
	}
	 
	public static void main(String[] args) {
		StringTo s=new StringTo("siva",614); 
		System.out.println(s);
	}
}
