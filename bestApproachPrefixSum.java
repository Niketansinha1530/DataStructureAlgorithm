package DataStructureAndAlgorithm;

import java.util.Scanner;

public class bestApproachPrefixSum {
//time complexity: O(m*n)
	//space complexity: O(n)
	public static void prefixSumMatrix(int [][]arr)
	{
		int m=arr.length;//row
		int n=arr[0].length;//column
		//traversed the array row-wise to calculate the row-wise prefix sum
		
		for(int i=0;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				arr[i][j]+= arr[i][j-1];
			}
		}
		//traversed the array colums-wise to calculate the colums-wise prefix sum
		//final 2D matrix
		for(int j=0;j<n;j++)
		{
			for(int i=1;i<m;i++)
			{
				arr[i][j]+= arr[i-1][j];
			}
		}
	}
	//time complexity: O(1)
		//space complexity: O(1)
	public static int SumRegion(int [][]arr,int r1,int c1,int r2,int c2)
	{
		int sum=arr[r2][c2];
		int up=arr[r1-1][c2];
		int left=arr[r2][c1-1];
		int repeated_region=arr[r1-1][c1-1];
		int result=sum-up-left+repeated_region;
		
		return result;
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Row Number = ");
		int r=sc.nextInt();
		System.out.println("Enter Column Number = ");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter value inside 2D Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
	
		System.out.println("Enter the value of r1");
		int r1=sc.nextInt();
		System.out.println("Enter the value of c1");
		int c1=sc.nextInt();
		System.out.println("Enter the value of r2");
		int r2=sc.nextInt();
		System.out.println("Enter the value of c2");
		int c2=sc.nextInt();
		
		prefixSumMatrix(arr);
		int result= SumRegion(arr,r1,c1,r2,c2);
		
		System.out.println("sum of rectangle Result = "+ result);


	}
	

}
