package java_interview_programs;

import java.util.Scanner;

public class Swapping_num_wiithout_3rdvarible {

	public static void main(String[] args)
	{
		
		Scanner sc =new Scanner(System.in);
	    System.out.println("enter first number");
	    int first_num=sc.nextInt();
	    System.out.println("enter second number");
	    int second_num=sc.nextInt();
	   /* 
	    first_num=first_num+second_num;
	    second_num=first_num-second_num; 
	    first_num=first_num-second_num;
	    
	    */
	    
	  /*  first_num=first_num*second_num;
	    second_num=first_num/second_num; 
	    first_num=first_num/second_num;
	   */
	    
	    
	    second_num=first_num+second_num-(first_num=second_num);
	    
	    System.out.println("AFTER SWAPPPING WITHOUT USING 3rd VARIBLE");
		System.out.println("FIRST NUMBER  "+first_num);
		System.out.println("SECOND NUMBER  "+second_num);
		sc.close();
	    
	    
	    

	}

}
