package practice2;

import java.util.Arrays;

public class Arrats_Sort_and_Foreach {
	public static void main(String[] args) {
		int [] a= {1,8,2,6,3,4,5,4};
		
		for(int i : a) {
			System.out.println(i);
		}
		
		Arrays.sort(a);
		
		System.out.println("after sort ");
		for(int c :a) {
			System.out.println(c);
		}
		
		
	}
}
