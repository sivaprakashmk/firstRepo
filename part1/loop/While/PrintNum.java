import java.util.Scanner;
class PrintNum
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter until where you whant to print");
		int n = s.nextInt();
		int i = 1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}