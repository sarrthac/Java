package Top100_java;

//Greatest of two numbers:

import java.util.*;
public class Greatest_of_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int t2 = sc.nextInt();
		
		if(T > t2)
		{
			System.out.println( T + " is Greater");
		}else {
			System.out.println(t2 + " is Greater");
		}

	}

}
