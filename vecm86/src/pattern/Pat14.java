package pattern;

public class Pat14 {
	public static void main(String[] args) {
		int n=5;
		char c='a';
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(c+" " );
				c++;
			}
			System.out.println();
		}
	}
}
