package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Al2 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("guna");
		a1.add("sana");
		a1.add("mana");
		a1.add("vana");
		a1.add("pana");
		
		System.out.println(a1);
		Scanner s=new Scanner(System.in);
		System.out.println("say your friend name");
		String name=s.next().toLowerCase().trim();
		
		if (a1.contains(name)) {
		System.out.println("yes... take your friend ");
		a1.remove(name);
		System.out.println(a1);
		}
		else
			System.out.println("No...yoour friend gone somewhere");
	}
}
