package practice1;

import java.util.Scanner;

public class Fact1 {	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt(), count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("count of factors for your number is: "+count);
	}
}
