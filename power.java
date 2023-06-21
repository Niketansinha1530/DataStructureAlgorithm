package DataStructureAndAlgorithm;

import java.util.Scanner;

public class power {
	public static int pow(int a,int b)
	{
		int result=0;
		int final_result=0;
		if(b==1)
		{
			return a;
		}
		else {
			result=pow(a,b/2);
			final_result=result*result;
			
			if(b%2!=0)
			{
				return a*final_result;
			}
			else {
				return final_result;
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int n=sc.nextInt();
	System.out.println("Enter power of an Number ");
	int p=sc.nextInt();
	
	int result=pow(n,p);
	System.out.println("Output= "+result);
	
}
}
