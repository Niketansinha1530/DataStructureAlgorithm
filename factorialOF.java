package DataStructureAndAlgorithm;

import java.util.Scanner;

public class factorialOF {

	public static long Fact(int n)
	{
		long result=0;
		if(n<=1)
		{
			return 1;
		}
		else {
			result=n*Fact(n-1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=scn.nextInt();
		
		long result=Fact(num);
	
		System.out.println("Factorial= "+result);
	}

}
