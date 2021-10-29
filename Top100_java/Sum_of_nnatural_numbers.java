package Top100_java;
//Sum of First N Natural numbers

import java.util.*;
import java.io.*;
public class Sum_of_nnatural_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans1 = Approch1(N);
		int ans2 = Approch2(N);
		System.out.println(ans1);
		System.out.println(ans2);

	}
	
	static int Approch1(int N)
	{
		int sum = 0;
		for(int i = 1; i <= N; i++)
		{
			sum = sum + i;
		}
		return sum;
	}
	
	static int Approch2(int N) {
		//formula
		int result = N * (N + 1)/2;
		
		return result;
	}

}
