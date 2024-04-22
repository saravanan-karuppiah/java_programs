package java_interview_programs;

import java.util.Scanner;

public class print_amstrong_number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the starting number  ");
		long start=sc.nextLong();
		System.out.print("enter the ending number  ");
		long end=sc.nextLong();
		long digits=0;
		long a=0;
		long result=0;
		
		
		
		for(long i=start;i<=end;i++)
		{    long b=i;
		     digits=check_amstrong_number.digits(b);
			while(b>0)
			{   
				a=b%10;
				result=result+(check_amstrong_number.power(a, digits));
				b=b/10;
				
			}
			
			if(i==result)
			{
				System.out.println(result);
			}
			result=0;
		}
		
       sc.close();
	}

}
