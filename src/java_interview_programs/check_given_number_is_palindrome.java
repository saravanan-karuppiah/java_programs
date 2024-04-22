package java_interview_programs;

import java.util.Scanner;

public class check_given_number_is_palindrome {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number to check it is palindrome or not  ");
		int b=sc.nextInt();
		int a=0;
		int num=b;
		
		while(num>0)
		{
			a=a*10+num%10;
			num=num/10;
		}
		
		if(b==a&&b>0) 
		{
		System.out.print("the given number is palindrome  "+a);	
			
		}
		else
		{
			System.out.println("the given number is not palindrome.."+a);
		}
     sc.close();
	}

}
