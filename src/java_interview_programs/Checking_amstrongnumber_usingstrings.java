package java_interview_programs;

import java.util.Scanner;

public class Checking_amstrongnumber_usingstrings {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check it is palindrome or not");
		int num=sc.nextInt();
		int result=0;
		String a=Integer.toString(num);
		for(int i=0;i<a.length();i++)
		{
			int b=a.charAt(i)-'0';
		    double c= Math.pow(b, a.length());
		    result=(int)c+result;
			
		}
		if(num==result)
		{
			System.out.println("the number is palindrome");
			
		}
		else
		{
			System.out.println("the number is not palindrome");
			
		}
		
		
		sc.close();

	}

}