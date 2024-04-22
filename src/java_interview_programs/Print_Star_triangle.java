package java_interview_programs;

import java.util.Scanner;

public class Print_Star_triangle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of lines");
		int a= sc.nextInt();
		
		
		//triangle
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
	
			}
			System.out.println();	
		}

		
		
		
		//inverted triangle
		/*
		for(int i=a;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
	
			}
			System.out.println();	
		}
		
		*/
		
		sc.close();

	}

}
