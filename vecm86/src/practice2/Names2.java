package practice2;

import java.util.Arrays;
import java.util.Comparator;

public class Names2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ss = {"sssss","iiii","vvv","aa"};
		
		Comparator comp1 =new CompDemo2();
		
		Arrays.sort(ss,comp1);
		
		System.out.println("used comparator ()");
		for (String sa:ss) {
			System.out.print(sa+",");
		}
	}

}
