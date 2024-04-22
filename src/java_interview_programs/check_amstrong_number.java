package java_interview_programs;

import java.util.Scanner;

public class check_amstrong_number {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a number to check if it is amstrong number  ");
		long num=sc.nextLong();
		long b=num;
		long digits=0;
		long a=0;
		long result=0;

		digits=digits(b);
		
		while(b>0)
		{
			a=b%10;
			result=result+power(a,digits);
			b=b/10;
		}
		
		if(result==num)
		{
			System.out.println("the given number is amstrong number");
		}
		else
		{
			System.out.println("the given number is not amstrong number");
			
		}
	sc.close();	
	
	}
	
	
	public static long power(long base,long exp)
	{long a=1;
		for(long i=1;i<=exp;i++)
		{
			a=a*base;
		}
		return a;
		
	}

	
	public static long digits(long num)
	{long count=0;
		while(num>0)
		{
			count=count+1;
			num=num/10;
		}
		return count;
	}


}
