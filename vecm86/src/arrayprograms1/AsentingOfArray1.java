package arrayprograms1;

import java.util.Scanner;

public class AsentingOfArray1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int size =s.nextInt();
		int [] a =new int[size];
		System.out.println("enter elements of array");
			for (int i = 0; i < a.length; i++) {
				a[i] =s.nextInt();
			}
			System.out.println("before sorting");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			System.out.println("after sorting array");
			sort(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
	}
		public static int[] sort(int [] a) {
			int min,temp = 0;
			for (int i = 0; i < a.length; i++) {
				min = i;
				for (int j = i+1; j < a.length; j++) {
					if (a[j]<a[min]) {
						min = j;
					}
				}
				temp = a[i];
				a[i] = a[min];
				a[min] = temp;	
			}
			return a;
		}
}