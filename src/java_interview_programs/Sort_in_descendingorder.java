package java_interview_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_in_descendingorder {

	public static void main(String[] args) 
	{

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter total number of integer");
		Integer a=sc.nextInt();//why integer instead of int because collection does not support primitive data type.
		Integer b[]=new Integer[a];
		
		for (int i=0;i<a;i++)
		{  
			System.out.println("enter " +(i+1)+ " number of  "+a);
			b[i]=sc.nextInt();
		
		}
		
		Arrays.sort(b,Collections.reverseOrder());
		
		
		
		
		for(int i=0;i<a;i++)
		{
		System.out.println(b[i]);
		}
		sc.close();
	    
		
		
		

	}

}
