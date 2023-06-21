package DataStructureAndAlgorithm;
//Time Complexity : O(logb)
import java.util.Scanner;

public class bestApproachForPower {

	public static int Bestpower(int a,int b)
	{
		int result=0;
		int final_value=1
				;
		//Base condition
		if(b==1)
		{
			return a;
		}
		else {
			result=Bestpower(a, b/2);
			final_value=result*result;
			
			if(b%2!=0)
			{
				result= a*final_value;
			}
			else {
				result= final_value;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int a=scn.nextInt();
		System.out.println("Enter power of Number: ");
		int b=scn.nextInt();
		
		int result=Bestpower(a,b);
		
		System.out.println("Value = "+result);
	}
}
