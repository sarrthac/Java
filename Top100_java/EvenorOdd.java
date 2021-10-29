package Top100_java;

// Check if number is Even or Odd

import java.util.*;
import java.io.*;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 2 == 0)
		{
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
	}

}

//Note - 0 is even