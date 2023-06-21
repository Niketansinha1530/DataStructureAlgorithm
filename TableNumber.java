package DataStructureAndAlgorithm;

import java.util.Scanner;

public class TableNumber {

	public static void Table(int n,int k)
	{
		
		if(k==1)
		{
			 System.out.println(n);
			 return;
		}
		
			Table(n, k-1);
			 System.out.println(n*k);
	}
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n=scn.nextInt();
		System.out.println("Enter Multiplication time ");
		int k=scn.nextInt();
		System.out.println("Output: ");
		Table(n,k);
		

	}

}
