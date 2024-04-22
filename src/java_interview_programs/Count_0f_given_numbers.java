package java_interview_programs;

import java.util.Scanner;

public class Count_0f_given_numbers {

	public static void main(String[] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the number to count it's digits   ");
		long num=sc.nextLong();
		int count=0;
		
		while(num>0)
		{
			count=count+1;
			num=num/10;
		}		
		System.out.println(count);
	   sc.close();
	}

}
