package java_interview_programs;

import java.util.Scanner;

public class Reverse_the_String {

	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	    System.out.print("enter a string to reverse   ");
	    String a= sc.next();//for single word
	   // String a= sc.nextLine();// for multiple word with spaces
	    String rev="";
	    
	   /* 
	    for (int i=a.length()-1;i>=0;i--)
	     {
	    	rev=rev+a.charAt(i);
	     }
	      System.out.println(rev);
	      sc.close();
	    */
	    
	   /* 
	    char b[]=a.toCharArray();
	    
	    for (int i=b.length-1;i>=0;i--)
	    {
	    	rev=rev+b[i];
	    }
	    System.out.println(rev);
	    sc.close();
	    */
	    
	    
	    StringBuffer sb =new StringBuffer(a);
	   System.out.println(sb.reverse());

	    
	    sc.close();
	    

	}

}
