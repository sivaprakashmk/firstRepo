package practice1;

import java.util.Scanner;

public class Palin1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		System.out.println("the reverse num is:"+reverse(n));
	}
		public static int reverse(int n) {
			int rev=0;
			while(n!=0) {
			int d=n%10;
			rev=(rev*10)+d;
			n/=10;
			}
			return rev;		
		}
}