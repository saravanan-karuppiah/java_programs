package java_interview_programs;

import java.util.HashMap;
import java.util.Scanner;

public class Count_words_in_given_strings {

	public static void main(String[] args)
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a line of string  ");
		String s=sc.nextLine();
		HashMap<String,Integer>h=new <String,Integer>HashMap();
		
		String x[]=s.split(" ");
		for(String a:x)
		{
			if(h.containsKey(a))
			{
			 int z=h.get(x)+1;
			 h.put(a,z+1 );
			}
			
			else
			{
				h.put(a,1);
				
			}
			
			
			
		}
		System.out.print(h);
		sc.close();

	}

}
