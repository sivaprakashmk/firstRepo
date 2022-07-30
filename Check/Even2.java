import java.util.Scanner;
class Even2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = s.nextInt();
		Even(n);
	}
	public static void Even(int n)
	{
		for(int i = 1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
