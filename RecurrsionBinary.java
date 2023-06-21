package DataStructureAndAlgorithm;
//Time complexity is same as normal binarry search O(log n).
import java.util.Scanner;

public class RecurrsionBinary {
public static int binarry(int arr[],int low,int high,int target)
{
	while(low<=high)
	{
		int mid=low+(high-low)/2;
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
		return binarry(arr,mid+1,high,target);
		}
		else {
		return	binarry(arr,low,mid-1,target);
		}
	}
	return -1;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 4, 6, 8, 10 };
		int low = 0;
		int high = arr.length - 1;
		System.out.println("Enter target value = ");
		int target=sc.nextInt();
		int index=binarry(arr,low,high,target);
		if(index==-1)
		{
			System.out.println("target value not present in given array");
		}
		else {
			System.out.println("Targer value at index= "+index);
		}
		
		

	}

}
