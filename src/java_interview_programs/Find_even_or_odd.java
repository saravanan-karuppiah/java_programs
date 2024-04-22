package java_interview_programs;

import java.util.Scanner;

public class Find_even_or_odd {

	public static void main(String[] args)
	{
	   Scanner sc =new Scanner(System.in);
	   System.out.print("enter the number to find even or odd  ");
	   int num=sc.nextInt();
	   if(num%2==0&& num!=0)
	   {
		   System.out.println("the given number is even");  
	   }
	   else if(num%2!=0&& num!=0)
	   {
		   System.out.println("the number is odd");
		   
	   }
	   else 
	   {
		   System.out.println("invalid input");
	   }
	   sc.close();

	}

}
