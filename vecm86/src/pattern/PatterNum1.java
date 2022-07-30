package pattern;

public class PatterNum1 {
		  public static void main(String[] args) {
		  	int n=5;
		  	for (int i=1,p=6;i<=n;i++){
		  			p--;
		  		for(int j=1;j<=i;j++) {
		  			System.out.print("  ");
		  		}
		  		int c =p;
		  		for(int j=i;j<=n;j++) {
		  			System.out.print(c-- +" ");
		  		}
		  		System.out.println();
		  	}
		  }
	
}
