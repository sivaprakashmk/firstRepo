import java.util.Scanner;
class OddNumM_N
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println( "enter the m value");
		int m = s.nextInt();
		System.out.println( " enter the n value ");
		int n = s.nextInt();
		while (m<=n)
		{
			if (m%2!=0)
			{
				System.out.println(m);
			}
			m++;
		}
	}
}
