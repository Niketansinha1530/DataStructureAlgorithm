package DataStructureAndAlgorithm;

import java.util.*;

public class permutations {
public static void backtrack(List<List<Integer>> result,List<Integer> temp, int []nums)
{
	if(temp.size()==nums.length)
	{
		result.add(new ArrayList<>(temp));
		return ;
	}
	for(int i=0;i<nums.length;i++)
	{
		if(temp.contains(nums[i]))
			continue;
		temp.add(nums[i]);
		
		backtrack(result ,temp,nums);
		temp.remove(temp.size()-1);
		
	}
}
public static List<List<Integer>> permute(int []nums)
{
	List<List<Integer>> result=new ArrayList<>();
	backtrack(result,new ArrayList<Integer>() ,nums);
	System.out.println(result);
	return result;
}
public static void main(String[] args) {
	int nums[]= {1,2};
	permute(nums);
	
}
}
