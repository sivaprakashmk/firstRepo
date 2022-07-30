import java.util.Scanner;
class  FactInReturn1
{
	public static boolean fact(int n)
	{
		int	fact = 1;
		for (int i = 1;i<=n ;i++ )
		{
			fact = fact*i;
		}
			if (fact>1)
			{
				return true;
			}
			else
				return false;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value ");
		int n = s.nextInt();
		System.out.println(fact(n));
	}
}
