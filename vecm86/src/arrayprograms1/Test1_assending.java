package arrayprograms1;

public class Test1_assending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a  =new int[] {5,3,1,4,2,9,7,8,0,5,8};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" "); 
		}
	}

}
