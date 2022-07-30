package part1program;

public class AmstrongOrNot {

	public static int countd(int n) {
		int c = 0;
		while (n!=0) {
			c++;
			n/=10;
		}
		return c;
	}

	public static int isamstrong(int n) {
		int temp = 0;
		int a = n;
		while(a!=0) {
			int sum =1;
			int d=a%10;
			for (int i = 1; i <=countd(n); i++) {
				sum*=d;
			}
			temp+=sum;
			a/=10;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int n =371;
		if(isamstrong(n)==n) {
			System.out.println("the given num is amstrong ");
		}
		else 
			System.out.println("the num is not amstrong.....");
	}
}