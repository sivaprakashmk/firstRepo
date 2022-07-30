class Ic1
{
	public static void main(String[] args)
	{
		int a = 90;
		int b = a++;
		int c = a*--b;
		System.out.println(a);//91
		System.out.println(b);//89
		System.out.println(c);//8099
	}
}