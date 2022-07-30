package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Al1 {
	public static void main(String[] args) {
		ArrayList colours=new ArrayList();
		colours.add("green");
		colours.add("red");
		colours.add("blue");
		colours.add("yellow");
		System.out.println(colours);
		
		//contains		
		Scanner s =new Scanner(System.in);
		System.out.println("enter a colour to check if available");
		String name=s.next().toLowerCase().trim();      
		if(colours.contains(name)) {
			System.out.println("yes yours colour is available");
		}
		else {
			System.out.println("sorry...");
			System.out.println("your colour is not available");	
		}		
	}
}