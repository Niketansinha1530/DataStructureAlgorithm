package DataStructureAndAlgorithm;

import java.util.Scanner;
//time complexity is big O of (log(n)).
class bs
{
	int BinnarySerach(int []arr ,int x)
	{
		int low=0;
		int high=arr.length-1;
		
		while(low <=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==x)
			{
				return mid;
			}
			else if (arr[mid]<x) {
				low=mid+1;
			} 
			else {
				high=mid-1;
			}
		
		}
		return -1;
	}
	
}
public class BinnaySearch {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12,14};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int x=sc.nextInt();
		
		bs sr=new bs();
	int value=	sr.BinnarySerach(arr, x);
	
	System.out.println(value);
	
	}

}
