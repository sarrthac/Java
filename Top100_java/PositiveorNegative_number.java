package Top100_java;

// check if number is Positive or Negative
import java.util.*;
import java.io.*;
public class PositiveorNegative_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N == 0)
		{
			System.out.println("Enter valid input");
		}
		else if(N >= 1)
		{
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}

	}

}
