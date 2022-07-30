package practice2;

import java.util.Arrays;

public class Equals_comparition {

	public static void main(String[] args) {
		// int [] a1 ={10,20,30};
		// int [] a2 ={10,20,30};
		 
		// boolean b = Arrays.equals(a1, a2);
		 //System.out.println(b);
		 
		 System.out.println("______________________");
		 System.out.println("______________________");
		 System.out.println("______________________");
		 
		 int [] i1 = {11,22,33};
		 int [] i2 = {44,55,66};
		 
		 boolean b1 = true;
		 int i=0;
		 while( i <=i1.length) {
			 if(i1[i]!=i2[i]) {
				 b1=false;
				 System.out.println("both [] are not same ");
				 break;
			 }
			 i++;
			 if(b1=true ) {
				 System.out.println("same ");
			 }
		 }
		
	}
}
