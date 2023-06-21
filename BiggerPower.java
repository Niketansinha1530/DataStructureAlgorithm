package DataStructureAndAlgorithm;
//This program for finding bigger value if power is too big.
import java.math.BigInteger;
import java.util.Scanner;

public class BiggerPower {

	public static BigInteger power(BigInteger a,int b)
	{
		BigInteger result,final_result;
		//Base condition
		if(b==1)
		{
			return a;
		}
		//recursive calls
		else {
			result=power(a, b/2);
			final_result=result.multiply(result);//yaha result*result kam nahi karegaa
			
			if(b%2!=0)
			{
				return a.multiply(final_result);
			}
			else {
				return final_result;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number= ");
		BigInteger a=sc.nextBigInteger();
		System.out.println("Enter power = ");
		int b=sc.nextInt();
		
		BigInteger result=power(a,b);
		System.out.println("Result= "+result);
	}
}
