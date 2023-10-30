

import java.util.*;
import java.io.*;
import java.lang.*;

public class GenericDemo {

	static boolean isPrime( int num) {
		int flag = 0;
		for ( int i = 2; i < num ;i++) {
			
			if ( num%i == 0) {
				flag = 1;
				
				break;
			}
			
		}
		
		if ( flag == 0) {
			
			return true;
		}
		
		return false;
		
	}
	
	static boolean isEven( int num) {
	
		if ( num%2 == 0) {
			
			return true;
			
		}
		
		else {
			
			return false;
		}
	}
	
static boolean isOdd( int num) {
	
		if ( num%2 == 0) {
			
			return false;
			
		}
		
		else {
			
			return true;
		}
		
	}

	static <T> void count(String type, T[] el) {
		
		int even = 0, odd = 0, prime = 0, palin = 0;
		
		if ( type.equals("prime")) {
			
			for ( T value:el) {
				
				if (isPrime(Integer.parseInt(value.toString()))) {
					
					prime++;
				}
			}
			
			System.out.println("Total prime:"+ prime);
		}
		
		if ( type.equals("even")) {
			
			for ( T value:el) {
				
				if ( isEven(Integer.parseInt(value.toString()))) {
					
					even++;
				}
				
			}
			
			System.out.println("Total even:" + even);
		}
		
		if (type.equals("odd")) {
			
			for ( T value:el) {
				
				if (isOdd(Integer.parseInt(value.toString()))) {
					
					odd++;
				}
				
			}
			System.out.println("Total odd:"+ odd);
		}
		
		if (type.equals("palindrome")) {
			
			for ( T value:el) {
				
				StringBuffer rev = new StringBuffer(value.toString());//space to store the data
				
				if ( value.toString().equals(new String(rev.reverse()))) {
					
					palin++;
				}
				
			}
			System.out.println("Total Palindrome:"+ palin);
		}
	
	} 

	public static void main(String[] args) {
		Integer iarray[] = {45,7,12,84,38,44,29,30,19};
		count("even",iarray);
		Short sarray[] = {45,7,12,84,38,44,29,30,19};
		count("even",sarray);
		count("odd", sarray);
		count("prime", sarray);
		count("palindrome", sarray);

	}

}

--------------------------------------------------------------------------------------
Output:
Total even:5
Total even:5
Total odd:4
Total prime:3
Total Palindrome:2

