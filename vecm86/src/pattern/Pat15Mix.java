package pattern;

public class Pat15Mix {
	public static void main(String[] args) {
		int n =5;
		char c='a';
		int a=1;
		int num=2;
		for (int i = 0; i <n; i++) {
				for (int j = 0; j <n; j++) {
					if(num%2==0) {
					System.out.print(a+" ");
						a++;
						num++;
					}
					else {
							System.out.print(c+" ");
							c++;
							num++;
						}
			}
			System.out.println();
		}
	}
}
