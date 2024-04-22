package java_interview_programs;

import java.util.Scanner;

public class Check_palindrome_string {

	public static void main(String[] args)
	{
		    Scanner sc =new Scanner(System.in);
		    System.out.print("enter a string to reverse   ");
		    String a= sc.next();//for single word
		    // String a= sc.nextLine();// for multiple word with spaces
		    String rev="";
		    
		    
		    
		    for (int i=a.length()-1;i>=0;i--)
		     {
		    	rev=rev+a.charAt(i);
		     }
		    
		    if(rev.equals(a))
		    {
		    	
		     System.out.println("the given string is palindrome   "+rev);
		    	
		    }
		    else
		    {
		    	System.out.println("the given string is not pqlindrome..."+rev);
		    	
		    }
		      
		      sc.close();
		    

		    
		    
		    
		    
		    
		    
	}

}
