package array_program2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		int sum = 0;
		int i = 1;
		while (i <= n/2) {

			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		if (sum == n) {
			System.out.println("perfect");
		} else {
			System.out.println("not perfect");
		}
	}

}
