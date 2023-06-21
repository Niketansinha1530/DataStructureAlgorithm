package DataStructureAndAlgorithm;

import java.util.Scanner;

public class BrutePowerOfElement {

	public static int powerOfElement(int a,int b)
	{
		int result=0;
		if(b==1)
		{
			return a;
		}
		else {
			result=a*powerOfElement(a, b-1);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a=scn.nextInt();
		System.out.println("Enter power of Number: ");
		int b=scn.nextInt();
		
		int result=powerOfElement(a,b);
		
		System.out.println("Value = "+result);
	}
}
