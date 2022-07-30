import java.util.Scanner;
class PalinReturn
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = s.nextInt();
		if (palindrome(n))
		{
			System.out.println("the number is palindrome");
		}
		else
			System.out.println("the number is not palindrome");
		
	}
	public static boolean palindrome(int n)
	{
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
			int d = n%10;
			rev = (rev*10)+d;
			n/=10;
		}
		if (temp == rev)
		{
			return true;
		}
		else
			return false;
	}
}
