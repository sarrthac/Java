package Top100_java;
//Check whether a given number is prime or not

import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		if(N == 2 || N == 3)
		{
			System.out.println("Prime");
		
		}
		else
		for(int i = 2; i < N; i++)
		{
			if(N % i == 0)
				count++;
		}
		
		if(count > 0)
		{
		  System.out.println("Not Prime");
		}else {
			System.out.println("Prime");
		}
	}

}
