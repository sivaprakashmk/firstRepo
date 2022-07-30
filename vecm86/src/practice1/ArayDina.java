package practice1;

import java.util.Scanner;

public class ArayDina {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = s.nextInt();
		int[] a =new int[size];
		System.out.println("enter elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("the elements in array are:");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]);
		}
	}
}
