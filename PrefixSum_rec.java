//rectangle formation.
package DataStructureAndAlgorithm;
//brute Force approach.
import java.util.Scanner;

public class PrefixSum_rec {

	public static int Rectangle_sum(int arr[][],int r1,int c1,int r2,int c2)
	{
		int sum=0;
		for(int i=r1;i<=r2;i++)
		{
			for(int j=c1;j<=c2;j++)
			{
				sum+=arr[i][j];
			}
		}
		return sum;
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
		
		int result=Rectangle_sum(arr,r1,c1,r2,c2);
		
		System.out.println("sum of rectangle Result = "+ result);
	}

}
