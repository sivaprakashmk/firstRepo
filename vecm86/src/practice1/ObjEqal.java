package practice1;

public class ObjEqal {
	public static void main(String[] args) {
		Object o1=new Object();
		Object o2=new Object();
		Object o3=o1;
		System.out.println(o3.equals(o1));
		System.out.println(o2.getClass());
		System.out.println(o2.hashCode());
	}
}
