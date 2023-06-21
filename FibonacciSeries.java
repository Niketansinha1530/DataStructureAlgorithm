package DataStructureAndAlgorithm;

import java.util.Scanner;

public class FibonacciSeries {

	public static int Fibonacc(int n)
	{
		int result=1;
		if(n<=1)
		{
			return n;
		}
		else {
		result=	Fibonacc(n-1)+Fibonacc(n-2);
		}
		return result;
	}
	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number= ");
		int num=scn.nextInt();
		
		int result=Fibonacc(num);
		System.out.println("Fibonacci series = "+result);

	}

}
