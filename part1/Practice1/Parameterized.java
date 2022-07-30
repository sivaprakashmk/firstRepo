import java.util.Scanner;
class Parameterized
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int num = s.nextInt();
		count(num);
	}
	public static void count(int num)
	{
		int co = 0, cone = 0;
		while (num!=0)
		{
			int d = num%10;
			if (d==0)
			{
				co++;
			}
			else
				cone++;
			num/=10;
		}
		System.out.println("the total co is" +co);
		System.out.println("the total cone is" +cone);
	}
}

