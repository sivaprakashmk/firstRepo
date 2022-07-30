package array_program2;

public class Test_Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 145;
		int sum = 0;
		int dc = digitcount(n);
		// System.out.println(dc);
		int temp = n;
		for (int i = 0; i < dc; i++) {
			int d = temp % 10;
			sum += fact(d);
			temp /= 10;
		}
		if (sum == n) {
			System.out.println("strong");
		} else
			System.out.println("not strong");
	}

	private static int fact(int d) {
		int fact = 1;
		for (int i = 1; i <= d; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int digitcount(int n) {
		int count = 0, temp = n;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		return count;
	}
}
