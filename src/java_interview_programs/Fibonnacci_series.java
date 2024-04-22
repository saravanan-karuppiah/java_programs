package java_interview_programs;

import java.util.Scanner;

public class Fibonnacci_series {

	public static void main(String[] args) 
	{	
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the max limit  ");
		int end =sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		while(c<=end)
		{
		    c=a+b;
		    if (c<=end) {
			System.out.println(c);
		    }
			a=b;
			b=c;
		}
        sc.close();
	}

}
