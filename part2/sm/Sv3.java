class Sv3 
{
	static int i = 100;
	public static void leela()
	{
		int i = 25;
		System.out.println("i (local) :" +i);
		System.out.println("i (global) :" +Sv3.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		leela();
		int i = 101;
		System.out.println("i main is :" +i);
		System.out.println(" main end");
	}
}
