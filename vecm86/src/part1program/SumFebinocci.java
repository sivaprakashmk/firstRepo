package part1program;

import java.util.Scanner;

public class SumFebinocci {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	int n = s.nextInt();
	int a=0,b=1, c=0;
	int sum =0;
		while(c<=n) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			sum+=c;
			//System.out.println(c);
		}
		System.out.println(c);
		System.out.println( "sum if febinocci is :"+sum );
	}
}