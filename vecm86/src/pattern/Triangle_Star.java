package pattern;

public class Triangle_Star {
	
//	        * 
//	      * * * 
//	    * * * * * 
//	  * * * * * * * 


	public static void main(String[] args) {
		int n=11;
		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n; j++) {
				System.out.print("- ");
			}
			
			for (int j = 0,a=0; j < i-1; j++,a++) {
				if(a%2==0) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			for (int j = 0,a=0; j < i; j++,a++) {
				if(a%2==0) {
				System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
