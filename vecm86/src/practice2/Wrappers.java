package practice2;

public class Wrappers {

	public static void main(String[] args) {
		
		int i1 = 58;
		
		Integer i2 = Integer.valueOf(i1);
		System.out.println("boxing.. "+i2);
		System.out.println("_____________________");
		
		char ch1 = 'a';
		
		Character ch2 = Character.valueOf(ch1);
		System.out.println("boxing .."+ch2);
		System.out.println("_____________________");
		
		double d1 = 55.55;
		
		Double d2 = Double.valueOf(d1);
		System.out.println("boxing ..."+d2);
		System.out.println("___________________");
		
		float f1 = 22.22f;
		
		Float f2 = Float.valueOf(f1);
		System.out.println("boxing float.."+f2);
		System.out.println("________________");
		System.out.println("________________");
		
		//un boxing 
		
		Integer ii1 = 25;
		 
		int ii2 = ii1.intValue();
		System.out.println();
		System.out.println("un boxing ..."+ii2);	
	}

}
