package DataStructureAndAlgorithm;
//BinarrySearch on 2D Array.
import java.util.Scanner;

public class BinnarySearchIn2d {
	public static boolean Search(int arr[][],int target)
	{
		int m=arr.length;//row
		int n=arr[0].length;//column
		int low=0;
		int high=(m*n)-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			int mid_element=arr[mid/n][mid%n];
			
			if(mid_element==target)
			{
				return true;
			}
			else if(mid_element<target)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return false;
	}
public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	int arr[][]= {
			{1,3,5,7},
			{10,11,16,20},
			{23,30,34,60}
	};
	
	System.out.println("Enter the target value ");
	int target=sn.nextInt();
	
	boolean result=Search(arr,target);
	System.out.println("output = "+ result);
	
	
	
}
}
