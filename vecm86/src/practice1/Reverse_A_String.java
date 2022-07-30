package practice1;

public class Reverse_A_String {
	public static void main(String[] args) {
		String s = "avis ij hsakarp";
		String[] sr =s.split(" ") ;
		for(String st :sr) {
			for (int i= st.length()-1;i>=0;i--) {
				System.out.print(st.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
