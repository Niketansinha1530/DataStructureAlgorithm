package DataStructureAndAlgorithm;

import java.util.Scanner;
//Stair case problem.
public class NumberOF {
	public static int NumberOfWays(int n)
	{
		int result=0;
		if(n<=2)
		{
			return n;
		}
		else {
			result=NumberOfWays(n-1)+NumberOfWays(n-2);
		}
		return result;
		
	}
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter any number= ");
	int n=scn.nextInt();
	
	int result=NumberOfWays(n);
	System.out.println("values = "+result);
	
}
}
