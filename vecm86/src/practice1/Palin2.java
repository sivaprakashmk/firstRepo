package practice1;

import java.util.Scanner;

public class Palin2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		if( reverse(n))
		System.out.println("is  palindrome");
		else
		System.out.println("is not palindrome");
	}
		public static boolean reverse(int n) {
			int rev=0;
			int temp=n;
			while(n!=0) {
			int d=n%10;
			rev=(rev*10)+d;
			n/=10;
			}
			if(rev==temp)
			{
			return true;
			}
			else 
				return false;

		}
}		
