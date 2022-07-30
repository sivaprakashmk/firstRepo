package practice1;

public class FRv {
	static int i = FRv.j;
	static int j = 20;
	
	static {
		System.out.println(i);
		System.out.println(j);
		System.out.println(FRv.k);
	}
	 static int k =90;
	 static {
		 System.out.println("second block");
	 }
	 public static void main(String[] args) {
		System.out.println(i);
		System.out.println(i);
	}
}
