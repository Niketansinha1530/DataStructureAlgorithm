package DataStructureAndAlgorithm;

import java.util.Scanner;

public class SquareRoot {

public static int Square(int num)
{
	int low=0,high=num,result=-1;
	while(low<=high)
	{
	int	mid=low+(high-low)/2;
	int val=mid*mid;
	if(val==num)
	{
		return mid;
	}
	else if(val<num)
	{
		result=mid;
		low=mid+1;
	}
	else
		{
			high=mid-1;
		}
	}
	return result;
}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n=sc.nextInt();
		
		int result=Square(n);

		System.out.println("Square root of Number ="+result);
	}

}
