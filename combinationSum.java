package DataStructureAndAlgorithm;
import java.util.*;
public class combinationSum {
	public static void backtrack(List<List<Integer>> result ,int nums[],List<Integer> temp,int target,int start)
	{
		if(target<0)
		{
			return;
		}
		if(target==0)
		{
			result.add(new ArrayList<>(temp));
		}
		for(int i=start;i<nums.length;i++)
		{
			
			temp.add(nums[i]);
			backtrack(result,nums,temp,target-nums[i],i);
			temp.remove(temp.size()-1);
			
		}
	}
public static List<List<Integer>> combination(int nums[], int target)
{
	List<List<Integer>> result=new ArrayList<>();
	List<Integer> temp=new ArrayList<Integer>();
	backtrack(result, nums, temp,target,0);
	System.out.println(result);
	return result;
}
public static void main(String[] args) {
	int nums[]= {2,3,6,7};
	int target=7;
	combination(nums,target);
}
}
