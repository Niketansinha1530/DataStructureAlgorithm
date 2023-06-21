package DataStructureAndAlgorithm;

import java.util.Scanner;

public class AlternateSignSeries {
	//functions defination
public static int Alternate(int n)
{//Base case condition
	if(n==0)
	{
		return 0;
	}//recursive calls
	if(n%2==0)
	{
	return 	Alternate(n-1)-n;
	}
	else {
		return Alternate(n-1)+n;
	}
}
	public static void main(String[] args) {
	
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int n=sn.nextInt();
		
		int result=Alternate(n);
		System.out.println("Output = "+result);

	}

}
