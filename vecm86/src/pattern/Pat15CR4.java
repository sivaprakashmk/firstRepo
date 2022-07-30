package pattern;

public class Pat15CR4 {
	public static void main(String[] args) {
		int n =4;
		char c='a';
		int a=1;
		int num=2;
		for (int i = 0; i <n; i++) {
			if(num%2==0){
				for (int j = 0; j <n; j++) {
					System.out.print(a+" ");
					a++;
					num++;
				}
			} 
			else {
				for (int j = 0; j <n; j++) {
					System.out.print(c+" ");
					c++;
					num++;
				}
			}
			System.out.println();
		}
	}
}
