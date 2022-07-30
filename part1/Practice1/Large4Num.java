class Large4Num 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 11, c = 12, d = 13;
		if(a>b && a>c && a>d)
		{
			System.out.println(a+" is larger ");
		}
		else if(b>c && b>d)
		{
			System.out.println(b+ "is larger");
		}
		else if(c>d )
		{
			System.out.println(c+ " is larger ");
		}
		else 
			System.out.println(d+ " is larger ");
	}
}
