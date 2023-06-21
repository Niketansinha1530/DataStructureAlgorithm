package DataStructureAndAlgorithm;
//Lower Bound
import java.util.Scanner;

public class firstOccurence {
	public static int LowerBound(int arr[],int target)
	{
		int low = 0;
		int high = arr.length-1;
		int result=-1;
		while (low <= high) {
			int mid = low + (high-low) / 2;
			if (arr[mid] == target) {
				result= mid;
				//traveling left side of an array.
				high=mid-1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
			
				low = mid + 1;
			}

		}
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the target value: ");
		int target=sc.nextInt();
		
		int result= LowerBound(arr,target);
		
		if(result==-1)
		{
			System.out.println("Target value is not found");
		}
		else {
			System.out.println("Target value found at index = "+ result);
		}
				

	}

}
