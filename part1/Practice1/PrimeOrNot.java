import java.util.Scanner;
class  PrimeOrNot
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int count = 0;
		for (int i = 1 ;i<=n ;i++ )
		{
			if (n%i==0)
			{
			     count++;
			}
		}
			if (count==2)
			{
				System.out.println("the number is prime");
			}
			else 
				System.out.println("the number is not prime ");
		
	}
}
