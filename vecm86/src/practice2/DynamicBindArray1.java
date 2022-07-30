package practice2;

import java.util.Scanner;

public class DynamicBindArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//re initialization of array
		int [] a = {1,2,3};
		
		a = new int [] {4,5 ,6};
		
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
		}
	
		// dynamic binding 
		
		Scanner s = new Scanner(System.in);
		//System.out.println("enter 2 numbers  for array");
		int [] b ;
		
		b = new int[2];
			//System.out.println(b);
			
		for (int i = 0; i < b.length; i++) {
			b[i]=s.nextInt(); 
		}	
		
		for (int i = 0; i < b.length; i++) {
			//System.out.print(b[i]+",");
		}
		
		//trying but not working 
		int [] x;
		
		x = new int[] {1,2,3};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
