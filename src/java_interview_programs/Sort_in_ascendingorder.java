package java_interview_programs;

import java.util.Scanner;

public class Sort_in_ascendingorder {

	public static void main(String[] args)
	{
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter total number of integer");
		int a=sc.nextInt();
		int b[]=new int[a];
		
		for (int i=0;i<a;i++)
		{  
			System.out.println("enter a number of "+(i+1));
			b[i]=sc.nextInt();
		
		}
		
		/*Arrays.sort(b);//usually sort it to ascending order.
		
		for(int i=0;i<a;i++)
		{
		System.out.println(b[i]);
		}
		*/
		
		for(int i=0;i<b.length;i++)
			
		  {
		    for(int j=i+1;j<b.length;j++)
		    {
		    
		    int temp=0;
            if (b[i]>b[j])
             {
            	temp=b[i];
                b[i]=b[j];
                b[j]=temp; 	
             }
		    }

		  }
		for(int i=0;i<a;i++)
		{
		System.out.println(b[i]);
		}
		sc.close();
	    

	}

}
