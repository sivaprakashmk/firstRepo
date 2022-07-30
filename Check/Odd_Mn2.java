import java.util.Scanner;
class Odd_Mn2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter start number ");
		int n = s.nextInt();
		odd(n);
		
	}
	
			public static void odd(int n)
	{
				for(int i = 1;i<=n;i++)
			{
				if(i%2!=0)
				{
					System.out.println(i);
				}
			}
		
	}
}
