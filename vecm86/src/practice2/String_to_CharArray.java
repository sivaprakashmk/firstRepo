package practice2;

import java.util.Iterator;

public class String_to_CharArray {

	public static void main(String[] args) {
		
		String s1 = "sivajiprakash";
		
		char [] ch1 =s1.toCharArray();
		
		System.out.println(ch1);
		
		//taking index element individually
		
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]+" ");
		}
		
	}

}
