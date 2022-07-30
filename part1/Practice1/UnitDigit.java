import java.util.Scanner;
class UnitDigit
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter a numer ");
		int n = s.nextInt();
		System.out.println("your entered number is :"+n);
		int res = n%10;
		int res2 = n/10;
		System.out.println("the unit digit of a number is :" +res);
		System.out.println("the number remaining after unit place is " +res2);
	}
}
