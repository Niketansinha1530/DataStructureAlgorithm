package DataStructureAndAlgorithm;

import java.util.HashMap;
import java.util.Scanner;

public class twoSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter elements in arr: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target=sc.nextInt();
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			map.put(arr[i], i);
		}
		
		int result[]= {-1,-1};
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==target &&map.containsKey(0))
			{
				result[0]=i;
				result[1]=map.get(0);//key 0 ki value dedo
				break;
			}
			else if(map.containsKey(target-arr[i]))
			{
				if(map.get(target-arr[i])>i)//not choose same one 
				{
					result[0]=i;
					result[1]=map.get(target-arr[i]);
					break;
				}
			}
		}
		
		System.out.print(" Two sum index value are: [" +result[0]+","+result[1]+"]");
	}
}
