// import statment
import java.util.Scanner;
class Sw2
{
	public static void main(String[] args)
	{
	System.out.println("1 mon java");
	System.out.println("2 tue j2ee");
	System.out.println("3 wed html");
	System.out.println("4 thu sql");
	System.out.println("5 fri manual");
	System.out.println("6 sat css");
	System.out.println("7 sun default");
	// object of scanner 
	Scanner s = new Scanner(System.in);
	System.out.println("enter a choice");
	int choice = s.nextInt();
	switch(choice)
	{
		case 1:
			{
				System.out.println("today is mon u have to practice java");
			}
			break;
		case 2:
			{
				System.out.println("today is tue u have to practice j2ee");
			}
			break;
		case 3:
			{
				System.out.println("today is wed u have to practice html");
			}
			break;
		case 4:
			{
				System.out.println("today is thu u have to practice sql");
			}
			break;
		case 5:
			{
				System.out.println("today is fri u have to practice manual");
			}
			break;
		case 6:
			{
				System.out.println("today is sat u have to practice css");
			}
			break;
		default:
			{
				System.out.println("today sun have chill bro");
			}
			break;
	}
	}
}
				
			
				

