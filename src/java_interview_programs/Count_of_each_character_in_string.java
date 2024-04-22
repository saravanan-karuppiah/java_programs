package java_interview_programs;

import java.util.Scanner;

public class Count_of_each_character_in_string {

	public static void main(String[] args)
	{
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a string of different characters");
        String a=sc.next();
         int b[]=new int [256];
         int len =a.length();
        for (int i=0;i<len;i++)
        {
        	b[a.charAt(i)]=b[a.charAt(i)]+1;
        	
        }
      
       	char ch[]=new char[len];
       	for (int i=0;i<len;i++)
        	{
        		ch[i]=a.charAt(i);
        		int x=0;
        	for(int j=0;j<=i;j++)
        	{
        		if(a.charAt(i)==ch[j])
        		{
        			x=x+1;
        			
        		}
        	}
        		if (x==1)
        		{
        			System.out.println("The occurrence of "+ a.charAt(i)+ " is: " + b[a.charAt(i)]);
        		
        		}
 
        		
        	}
       	sc.close();

        		
        	}
 
        	
        	
        }


	

