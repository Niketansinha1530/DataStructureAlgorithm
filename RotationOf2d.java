//Time complexity : O(m*n)
//Space complexity : O(1)
package DataStructureAndAlgorithm;

import java.util.Arrays;

public class RotationOf2d {

	public static void Rotated_matrix(int arr[][])
	{
		int m=arr.length;//row
		int n=arr[0].length;//column
		//transpose of 2D matrix
		for(int i=0;i<m;i++)
		{
			for(int j=i;j<n;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		//swap the left and right side elements
		for(int i=0;i<m;i++)
		{
			int li=0;
			int ri=n-1;
			while(li<ri)
			{
				int temp=arr[i][li];
				arr[i][li]=arr[i][ri];
				arr[i][ri]=temp;
				li++;
				ri--;
			}
		}
		/*printing elements
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		*/
	}
	public static void main(String[] args) {
		
		
		int arr[][]= 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		
		Rotated_matrix(arr);
		/*printing all elements
		for(int a[]: arr)
		{
			for(int ar: a )
			{
				System.out.print(ar);
			}
			System.out.println();
		}
		*/
		// Printing all elements
		for(var mat: arr)
		{
			System.out.println(Arrays.toString(mat));
		}
		
		}

	}
