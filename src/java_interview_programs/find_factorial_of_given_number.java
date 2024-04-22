package java_interview_programs;

import java.util.Scanner;

public class find_factorial_of_given_number {

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		
		int num =sc.nextInt();
		int factorial=1;
		
		for (int i=num;i>0;i--)
		{
			factorial=factorial*i;
	
		}

		System.out.println("Factorial of given number   "+factorial);
		sc.close();

	}

}
