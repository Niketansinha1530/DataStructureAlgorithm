package DataStructureAndAlgorithm;

import java.util.Arrays;

public class SelectionSortQues {

	public static void SelectionSORT(int arr[])
	{
	int n=arr.length;
	
		for(int i=0;i<n;i++)
		{int min_idx=i;
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[j]<arr[min_idx])
				{
					min_idx=j;
				}
				
			}
			if(min_idx!=i)
			{
				//swap between arr[min_idx} and arr[i]
				int temp=arr[i];
				arr[i]=arr[min_idx];
				arr[min_idx]=temp;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = { 15, 24, 12, 2, 7, 69, 42, 100 };

		SelectionSORT(arr);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));

	}

}
