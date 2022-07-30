package part1program;

import java.util.Scanner;

public class XpowerN {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter a num for x vlaue");
		int x=s.nextInt();
		System.out.println("enter a num for n value");
		int n = s.nextInt();
		int p=1;
		for (int i = 1; i <= n; i++) {
			p*=x;
		}
		System.out.println("result for your expression "+p);
	}
}
