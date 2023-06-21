//Time complexity: O(n)
//Space comlexity: O(1)
package DataStructureAndAlgorithm;

public class PalindromeArray {
	public static void main(String[] args) {
		
		int arr[]= {1,4,3,2,1};
		int n=arr.length;
		int flag=0;
		for(int i=0;i<n/2;i++)
		{
			if(arr[i]!=arr[n-1-i])
			{
				System.out.println("Not Palindrome");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("It is Palindrome");
		}
	}

}
