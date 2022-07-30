import java.util.Scanner;
class  Numbers1_N
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value ");
		int n = s.nextInt();
		int i = 1;
		while (i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}
