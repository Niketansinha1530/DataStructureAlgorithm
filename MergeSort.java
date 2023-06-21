package DataStructureAndAlgorithm;

public class MergeSort {

	public static void mergeProcedure(int arr[],int l,int mid,int r)
	{
		int i,j,k;
		int n1=mid-l+1;
		int n2=r-mid;
		
		int lsubArray[]=new int[n1];
		int rsubArray[]=new int[n2];
		
		for( i=0;i<n1;i++)
		{
			lsubArray[i]=arr[l+i];
		}
		for( j=0;j<n2;j++)
		{
			rsubArray[j]=arr[mid+1+j];
		}
		
		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2)
		{
			if(lsubArray[i]<=rsubArray[j])
			{
				arr[k]=lsubArray[i];
				i++;
			}
			else {
				arr[k]=rsubArray[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=lsubArray[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k]=rsubArray[j];
			k++;
			j++;
		}
	}
	public static void mergeSort(int arr[], int l, int r) 
	{
		if(l<r)
		{
			int mid=l+(r-l)/2;
			
			mergeSort(arr, l, mid);
			
			mergeSort(arr,mid+1 , r);
			
			mergeProcedure(arr,l,mid,r);
		}
	}

	public static void printArr(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 8, 2, 45, 36, 14 };
		int n = arr.length;
		System.out.println("Array before sorting: ");
		printArr(arr);
		mergeSort(arr, 0, n-1);
		System.out.println("Array after sortitng: ");
		printArr(arr);
	}
}
