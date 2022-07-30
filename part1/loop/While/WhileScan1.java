import java.util.Scanner;
class WhileScan1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter n value");
		int n = s.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}