package DataStructureAndAlgorithm;

import java.util.Scanner;

public class fabSeries {
	public static int fab(int n)
	{
		int result=0;
		if(n<=1)
		{
			return n;
		}
		else {
			result=fab(n-1)+fab(n-2);
		}
	return result;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number= ");
int n=sc.nextInt();
int result=fab(n);
System.out.println("Output= "+result);

}
}
