package arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class Al2cc {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("guna 1");
		a1.add("sana 2");
		a1.add("mana 3");
		a1.add("vana 4");
		a1.add("pana 5");
		
		System.out.println(a1);
		Scanner s=new Scanner(System.in);
		System.out.println("say your friend name");
		String name=s.nextLine().toLowerCase().trim();
		
			if (a1.contains(name)) {
			for(int i=0;i<a1.size();i++) {
			//System.out.println("yes... take your friend ");
			a1.remove(name);
			System.out.println(a1);
			//bString name=s.nextLine().toLowerCase().trim();
			}
			}
				else
					System.out.println("No...your friend gone somewhere");
	
	}
}
