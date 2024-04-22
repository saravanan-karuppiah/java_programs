package java_interview_programs;

import java.util.Scanner;

public class Sum_of_the_digits {

	public static void main(String[] args)
	{
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number to  find sum of its digits  ");
		long num=sc.nextLong();
		long sum=0;
		while(num>0)
		{
			
			sum=sum+(num%10);
			num=num/10;
			
		}
		System.out.println("sum of the digits    "+sum);
		sc.close();
		
		

	}

}
