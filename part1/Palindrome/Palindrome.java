import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		int temp = num;
		System.out.println("the entered number is" +num);
		int rev = 0;
		while(num!=0)
		{
			int d = num%10;
			rev = (rev*10)+d;
			num/=10;
		}
		if(temp == rev)
		{
			System.out.println("the number is palindeome.");
		}
		else
		{
			System.out.println("the number is not a palindeome.");
		}
	}
}	