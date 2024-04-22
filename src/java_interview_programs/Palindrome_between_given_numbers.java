package java_interview_programs;

import java.util.Scanner;

public class Palindrome_between_given_numbers {

	public static void main(String[] args) 
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the starting number");
		int start =sc.nextInt();
		System.out.println("enter the ending number");
		int  end =sc.nextInt();
		
		for (int i=start;i<=end;i++)
		{  if(i>10)
		 {  
			int a=i; 
			int rev=0;
			while (a>0)
			{
			rev=rev*10+(a%10);
			a=a/10;
			}
		  if(i==rev)
		    {
			System.out.println(rev);
		    }
		 
		}
    }
		sc.close();
		
	}

}
