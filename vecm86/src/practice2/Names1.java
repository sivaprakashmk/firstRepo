package practice2;

import java.util.Arrays;
import java.util.Comparator;

public class Names1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names = {"sivaaaas","brabu","keerthi","muthu"};
		
		//dynamic binding 
		Comparator comp = new CompDemo1();
		
		Arrays.sort(names,comp);
		
		System.out.println("after use compare()");
		for(String sb:names) {
			System.out.print(sb+",");
		}
		
	}

}
