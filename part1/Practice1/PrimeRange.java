import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value ");
		int n1 = s.nextInt();
		System.out.println(" enter the last value ");
		int n2 = s.nextInt();
		for (int i = n1 ;i<=n2 ;i++ )
		{
			int count = 0;
			for (int j = 1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					count++;
				}
			}
				if (count==2)
				{
					System.out.println(i);
				}
		}
	}
}
