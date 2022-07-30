package usersthrow;

import java.util.Scanner;

public class ThrowUserDefined {
	public static void main(String[] args) throws RuntimeException  {
		Scanner  s = new Scanner(System.in);
		System.out.println("enter your age  for voting");
		int age = s.nextInt();
		try {
			if(age <18) 
				throw new AgeBar("youu are not eligible to vote");
			else
				System.out.println("you are eligible to vote...");
		}	
		catch(AgeBar b){
			System.out.println("please wait until to complete your age of 18");
		}
	}
}
