import java.util.Scanner;
class PrimeNumber1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter a number ");
		int n = s.nextInt();
		Prime(n);
		
	}
	
	public static void Prime(int n)
	
	{
		int count = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
			if (count==2)
				{
			
					System.out.println(n+ " :is the prime number ");
				}
				else
				{
					System.out.println(n+ "is not a prime number ");
				}
			
	}
}
