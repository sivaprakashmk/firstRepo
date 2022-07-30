package practice2;

import java.util.Comparator;

public class CompDemo2 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String)o1;
		String s2=(String)o2;
		
		if(s1.length()<s2.length())
			return 1;
		else if(s1.length()>s2.length())
			return -1;
		else
			return 0;
	}

}
