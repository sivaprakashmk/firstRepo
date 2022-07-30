package part1program;

import java.util.Scanner;

public class Countdigitinnum {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number ");
	int n =s.nextInt();
	int count = 0;
	System.out.print(n+" has ");
		while(n!=0){
			count++;
			n/=10;
		}
		System.out.println(count+" digits !");
	}
}
