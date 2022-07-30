package two_d_array;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ar = new int[3][3];

		int a = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				ar[i][j] = a;
				a++;
			}
		}
		int total=0;
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar.length; j++) {
				//if(ar[i]==ar[j]) {
				// System.out.print(ar[i][j]+" ");
				//}
				if(i==i&&j==0) {
					System.out.print(ar[i][j]);
					total+=ar[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("total :"+total);
	}
}
