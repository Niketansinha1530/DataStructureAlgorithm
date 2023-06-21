package DataStructureAndAlgorithm;

import java.util.Scanner;

public class FactorialOfNum {
	public static long factorial(int n) {
		long result = 0;
		//Base Condition
		if (n == 0 || n == 1) {
			return 1;
		} 
		//Recursive call
		else {
			result = n * factorial(n - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter any Number: ");
		int n = scn.nextInt();
		long fact = factorial(n);
		System.out.print("Factorial of Number= " + fact);
	}

}
