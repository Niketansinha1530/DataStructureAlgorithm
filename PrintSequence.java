package DataStructureAndAlgorithm;
import java.util.*;

public class PrintSequence {

	public static void printSe(int arr[], int index, ArrayList<Integer> tempArr)
	{
		//Base case
		if(index==arr.length)
		{
			//print sequence if size is greater than zero
			if(tempArr.size()>0)
			{
				System.out.println(tempArr);
			}
			return;
		}
		//recursive case
		//include
		printSe(arr, index+1, tempArr);
		//add value in temparr
		tempArr.add(arr[index]);
		
		//not include
		printSe(arr, index+1, tempArr);
		//remove last value
		tempArr.remove(tempArr.size()-1);
		
	}
	public static void main(String[] args) {
	
int arr[]= {1,2,3};
System.out.println(Arrays.toString(arr));
printSe(arr, 0, new ArrayList<>());
	}

}
