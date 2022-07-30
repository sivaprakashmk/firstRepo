package arraylist;

import java.util.ArrayList;

public class CDriver {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(new ColdBeverages("pepse",100));	
		a1.add(new ColdBeverages("cock",50));
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(new Snacks("potato chips","1.5",250));
		a2.add(new Snacks("corn","0.5",100));
		a2.add(new Snacks("layys","0.3",50));	
		System.out.println(a2);
		
		ArrayList a3 =new ArrayList();
		a3.addAll(a1);
		a3.addAll(a2);
		System.out.println(a3);
	}
}
