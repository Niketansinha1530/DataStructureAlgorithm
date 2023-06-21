//Time complexity : O(n)
//Space complexity :O(1)
package DataStructureAndAlgorithm;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,3,6,7};
		
		int n=arr.length;//size of array
		int sum=0;
		
		int sum_Of_Natural=((n+1)*(n+2))/2;
		
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		
		int missing_Number=sum_Of_Natural-sum;
		
		System.out.println("Missing no ="+missing_Number);
		
	}
}
