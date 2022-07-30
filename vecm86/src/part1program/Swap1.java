package part1program;

import java.util.Scanner;

public class Swap1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number ");
		int a = s.nextInt();
		System.out.println("enter 2nd number ");
		int b = s.nextInt();
		System.out.println("your entered 1st num is:" +a);
		System.out.println("your 2 nd num is:"+b);
		int temp;//or int temp=a;
		temp =a;
		a = b;
		b= temp;
		System.out.println("swap a num is:"+a);
		System.out.println("swap b num is :"+b);
	}
}
