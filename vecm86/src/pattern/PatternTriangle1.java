package pattern;

public class PatternTriangle1 {

	public static void main(String[] args) {
		int n =5 ;
		for(int i=1,p1=1;i<=n;i++,p1++) {
			int p3=1;
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
				int p4=p3;
				for(int j=1;j<i;j++) {
					System.out.print(p4++ +" ");
				}
					int p2=p1;
					for(int j=1;j<=i ;j++) {
						
						System.out.print(p2-- +" ");
					}
					System.out.println();
		}
		
	}

}
