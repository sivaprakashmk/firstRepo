import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the palindrome number");
		int n = s.nextInt();
		int temp = n;
		System.out.println("you entered palindrome numberis " +n);
		int rev = 0;
		while (n!=0)
		{
			int d = n%10;
			rev = (rev*10)+d;
			n/=10;
		}
		if (rev == temp)
		{
			System.out.println("the number is palindrome :");
		}
		else
			System.out.println("the num is not palindrome");
	}
}
