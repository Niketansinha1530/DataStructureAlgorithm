package DataStructureAndAlgorithm;

import java.util.Arrays;

public class BubbleSort {
	
public static void BubbleSorting(int arr[])
{ 
	int n=arr.length;
	boolean swapped=false;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			swapped=true;
			}
		
		}
		if(!swapped)
		{
			System.out.println("hello");
			break;
		}
	}
	
}
	public static void main(String[] args) {
		
		int arr[]= {15,24,12,2,7,69,42,100};
		
		BubbleSorting(arr);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));
		

	}

}
