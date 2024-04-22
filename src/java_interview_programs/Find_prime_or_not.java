package java_interview_programs;

import java.util.Scanner;

public class Find_prime_or_not {

	public static void main(String[] args) 
	{
		{
		        boolean flag = true; // Initialize flag to true
		        System.out.println("Enter input number");
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();
		        sc.close(); // Close the scanner after use to prevent resource leak

		        // 0 and 1 are not prime numbers, so handle them separately
		        if (num <= 1) {
		            System.out.println(num + " is not a prime number");
		            return;
		        }

		        // Start checking for divisibility from 2 to the square root of the number
		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                flag = false; // If divisible, set flag to false and break
		                break;
		            }
		        }

		        // If flag is still true, the number is prime
		        if (flag == true) {
		            System.out.println(num + " is a prime number");
		        } else {
		            System.out.println(num + " is not a prime number");
		        }
		        System.out.println(Math.sqrt(num));
		    }
		}


		
		
		
		
		
	}

