package Top100_java;

//Sum of digits of a number


import java.util.*;
public class Sum_of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int n = sc.nextInt();
		while(n > 0)
		{
			int temp = n % 10;
			sum += temp;
			n = n / 10;
		}
 
		System.out.println(sum);
	}

}
