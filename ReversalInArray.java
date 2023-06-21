package DataStructureAndAlgorithm;

public class ReversalInArray {
public static void main(String[] args) {
	//Approach first.
	/*
	int arr[]= {2,4,6,8,10,12,14};
	int[] arr1=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		arr1[i]=arr[arr.length-1-i];
	}
	
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]);
	}
	*/
	//Approach 2
	//Time complexity : O(n)
	//Space complexity : O(1)
	int arr[]= {2,4,6,8,10,12,14};
	
	int n=arr.length;
	
	for(int i=0;i<n/2;i++)
	{
		//Swap element between arr[i] and arr[n-1-i]
		int temp=arr[i];
		arr[i]=arr[n-1-i];
		arr[n-1-i]=temp;
	}
	
	System.out.println("Reversal array");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
