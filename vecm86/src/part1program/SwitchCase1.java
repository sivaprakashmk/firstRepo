package part1program;
import java.util.Scanner;
public class SwitchCase1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("welcome to GRAND CAFE");
		System.out.println("1 : tea 10 Rs");
		System.out.println("2 : coffee 12 Rs");
		System.out.println("3 : bujji 11 RS");
		System.out.println("4 : bonda 15Rs");
		System.out.println("5 : spl apple juice 50 Rs");
		System.out.println("\n"+"In the list what u want baby ");
		int choise = s.nextInt();
		switch (choise) {
			case 1:
			{
				System.out.println("how many tea u want");
					int cups =s.nextInt();
					int totaltea = cups*10;
					System.out.println("ok drink well & pay ");
					for (int i = 1; i <=5; i++) {
						System.out.println(".");
					}
					System.out.println("your bill : "+totaltea+" RS darling please pay");
			}
			break ;
			case 2 :
			{
				System.out.println("how many coffee u want");
					int cups =s.nextInt();
					int totalcoffee = cups*12;
					System.out.println(" ok drink well & pay ");
					for (int i = 1; i <=5; i++) {
						System.out.println(".");
					}
					System.out.println("your bill : "+totalcoffee+" RS darling please pay");
			}
			break ;
			case 3 :
			{
				System.out.println("how many bujji u want");
					int nos =s.nextInt();
					int totalbujji = nos*11;
					System.out.println(" ok eat well & pay ");
					for (int i = 1; i <=5; i++) {
						System.out.println(".");
					}
					System.out.println("your bill : "+totalbujji+" RS darling please pay");
			}
			break ;
			case 4:
			{
				System.out.println("how many bonda u want");
					int nos =s.nextInt();
					int totalbonda = nos*15;
					System.out.println(" ok eat well & pay ");
					for (int i = 1; i <=5; i++) {
						System.out.println(".");
					}
					System.out.println("your bill : "+totalbonda+" RS darling please pay");
			}
			break ;
			case 5 :
			{
				System.out.println("how many apple juice u want");
					int glass =s.nextInt();
					int totaljuice = glass*50;
					System.out.println(" ok drink well & pay ");
					for (int i = 1; i <=5; i++) {
						System.out.println(".");
					}
					System.out.println("your bill is : "+totaljuice+" RS darling please pay");
			}
			break ;
			default :
			{
				System.out.println("not in list.. ");
				
			}
		}
		
	}
}