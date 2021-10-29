package Top100_java;

//Leap year or not

import java.util.*;
public class Leap_year_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if((N % 400 == 0) || ((N % 4 == 0) && (N % 100 != 0)))
		{
			System.out.println(N + " is a Leap year");
		}else {
			System.out.println(N + " is not a Leap year" );
		}
		

	}

}


/*
 Logic - 
 
 Leap Year contains 366 days, which comes once every four years.
 Every leap year corresponds to these facts : 

1) A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
2) A leap year (except a century year) can be identified if it is exactly divisible by 4.
3) A century year should be divisible by 4 and 100 both.
4) A non-century year should be divisible only by 4.

 
 */