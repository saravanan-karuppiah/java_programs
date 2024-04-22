package java_interview_programs;

import java.util.Scanner;

public class To_find_maxium {

	public static void main(String[] args)
	{
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of entries");
		int a=sc.nextInt();
		int b[]=new int[a];
		
		for(int i=0;i<a;i++)
		{	
			System.out.println("enter  "+(i+1)+"  numbwer of  "+a);
			b[i]=sc.nextInt();
		}
		 int max=b[0];
		for(int i=1;i<a;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
				
			}
		}
		
		System.out.println("maxium  "+max);
        sc.close();
	}

}
