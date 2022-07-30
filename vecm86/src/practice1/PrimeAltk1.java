package practice1;

import java.util.Scanner;

public class PrimeAltk1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter 1st value ");
		int from =s.nextInt();
		System.out.println("enter 2nd value");
		int last=s.nextInt();
		int total =0;
		int k=1;
		for (int i=from;i<=last;i++) {
			int count = 0;
			for(int j = 1;j<=i;j++) {
				if (i%j==0) {
					count++;
					}
			}
				if (count==2) {
					if (k%2!=0) {
					System.out.println(i);
					total=total+i;
					}
					k++;
				}
		}
		System.out.println("total is :" +total);
	}
}
