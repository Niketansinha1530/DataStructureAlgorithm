package DataStructureAndAlgorithm;

public class MergeSortAgain {

	public static  void combineMerge(int arr[],int l,int mid,int r)
	{
		int i,j,k;
		
		int n1=mid-l+1;
		int n2=r-mid;
		
		int lsubarr[]=new int[n1];
		int rsubarr[]=new int[n2];
		
		for(i=0;i<n1;i++)
		{
			lsubarr[i]=arr[l+i];
		}
		for(j=0;j<n2;j++)
		{
			rsubarr[j]=arr[mid+1+j];
		}
		i=0;
		j=0;
		k=l;
		while(i<n1 && j<n2)
		{
			if(lsubarr[i]<=rsubarr[j])
			{
				arr[k]=lsubarr[i];
				i++;
			}
			else {
				arr[k]=rsubarr[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=lsubarr[i];
			k++;
			i++;
		}
		while(j<n2)
		{
			arr[k]=rsubarr[j];
			k++;
			j++;
		}
	}
	public static void merge(int arr[],int l,int r)
	{
		if(l<r)
		{
			int mid=l+(r-l)/2;
			merge(arr, l, mid);
			merge(arr, mid+1, r);
			combineMerge(arr, l, mid, r);
		}
	}
	public static void printing(int arr[])
	{
		for(int j:arr)
		{
			System.out.print(j+" ");
		}
	}		
	public static void main(String[] args) {
		int arr[]= {40,25,78,1,54,63,14,52,45};
		
		int n=arr.length;
		System.out.println("Array before sorting");
		printing(arr);
		merge(arr, 0, n-1);
		System.out.println();
		System.out.println("Array after sorting");
		printing(arr);
	}
}
