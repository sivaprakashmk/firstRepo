import java.util.*;
public class Pattern01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		getPattern(n);
	}
	
	static void getPattern(int x)
	{
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<x; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
