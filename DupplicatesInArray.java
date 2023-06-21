//Time complexity : O(n^2)
//Space complexity :O(1)
package DataStructureAndAlgorithm;

public class DupplicatesInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,4,5};
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{ flag=1;
				System.out.println("Duplicate Element = "+ arr[i]);
			}
			}
		}
		
		if(flag==0)
		{
			System.out.println("No Dupplicate");
		}
	}

}
