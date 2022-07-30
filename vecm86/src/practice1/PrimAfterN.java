package practice1;

public class PrimAfterN {
	public static void main(String[] args) {
		int n=40,c=0;
		for (int i =n ; i!=0; i++) {
			if (c<=20) {
				int count =0;
				for (int j = 1; j<=i; j++) {
					if (i%j==0) {
						count++;
					}
				}
			if (count==2) {
				c++;
				System.out.println(i);
			}
			if (c==20) 
				break;
			}
		}	
		System.out.println("c value is :" +c);
	}
}
