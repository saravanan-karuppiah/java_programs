package java_interview_programs;

import java.util.Scanner;

public class reversing_given_number {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number to reverse   ");
		int num=sc.nextInt();
		
		int a=0;
		while(num>0)
		{
		a=num%10+a*10;
		num=num/10;
	
		}
		System.out.print("the reverse of the given number is   "+a);
		sc.close();
		
		

	}

}
