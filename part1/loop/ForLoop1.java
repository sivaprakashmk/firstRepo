import java.util.Scanner;
class ForLoop1
{
	public static void main(String[] args)
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n value");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
			{
				int n = fact*i;
			}
		System.out.println(n+ "! = " +fact);
	}
}