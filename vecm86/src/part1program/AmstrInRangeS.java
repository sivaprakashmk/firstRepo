package part1program;

//import java.util.Scanner;

public class AmstrInRangeS {
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		//System.out.println("enter a number");
		//int  n = s.nextInt();
		int num=1000;
		for(int n=1;n<=num;n++) {
		if(isamstrong(n)) {
			System.out.println(n+"    amstrong number");
		}
		//else
			//System.out.println(n+" sorry ...the num is not amstrong");
		}
	}
	
	public static boolean isamstrong(int n) {
		int temp =n;
		int sum =0;
		int dc =digitcount(n);
		while(temp!=0) {
			int x =temp%10;
			sum = sum+power(x,dc);
			temp/=10;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static int power(int x,int dc) {
		int p=1;
		for(int i=1;i<=dc;i++) {
			p*=x;
		}
		return p;
	}
	public static int digitcount(int n) {
		int count=0;
		while(n!=0){
			count++;
			n/=10;
		}
		return count; 
	}	
}