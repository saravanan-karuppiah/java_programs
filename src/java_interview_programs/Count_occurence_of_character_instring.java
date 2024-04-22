package java_interview_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Count_occurence_of_character_instring 
{
    
	public static void main(String[]args)
	{
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string to find its characters and its occurences");
		String a= sc.next();
		
		
			char ch[]=a.toCharArray();
			
		HashMap<Character,Integer> h= new <Character,Integer>HashMap();
			
			
			for(char c:ch)
			{
				if (h.containsKey(c))
				{
					int x=h.get(c);
					h.put(c, x+1);
					
				}
				else
				{
					h.put(c, 1);
					
					
				}
				
				
			}
			
			
			
			System.out.println(h);
			
		
		
			
	sc.close();
			
		}
	
		
		
	}
	
	
	
	

	
	

