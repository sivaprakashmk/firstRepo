package practice2;

public class CharArray_to_String {

	public static void main(String[] args) {
		
		// 1) using constructor
		char [] ch = {'a','b','c','d'};
		
		String s1 = new String(ch);
		System.out.println(" constructor ().. "+s1);
		
		// 2) using value of()
		char [] ch1 = {'e','f','g','h'};
		
		String s2 =String.valueOf(ch1);
		System.out.println("value of ()... "+s2);
		
		//not using built in ()
		
		char [] ch3 = {'i','j','k','l'};
		
		String s3 = "";
		for(int i = 0;i<ch3.length;i++) {
			
			s3 =s3+ch3[i];
		}
		
		System.out.println("not built in ().... "+s3);
	}
}
