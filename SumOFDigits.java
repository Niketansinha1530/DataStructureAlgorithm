package DataStructureAndAlgorithm;

import java.util.Scanner;

public class SumOFDigits {
	public static int digits(int n)
	{
		int result=0;
		//Base case condition
		if(n==0)
		{
			return n;
		}
		//Recursive calls
		else
		{
		result=	(n%10)+digits(n/10);
		}
		return result;
	}
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter any number: ");
	int n=scn.nextInt();
	
	int result=digits(n);
	System.out.println(" The Sum of digits for a given Number = "+result);
}
}
