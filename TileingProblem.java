package DataStructureAndAlgorithm;

import java.util.Scanner;

public class TileingProblem {
public static int fixingTile(int n)
{int result=0;
	if(n<=3)
	{
		return n;
	}
	else {
		result=fixingTile(n-1)+fixingTile(n-2);
	}
	return result;
}
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the no of tiles: ");
		int n=sn.nextInt();
		
		int result=fixingTile(n);
		
		System.out.println("No of ways to fix tiles on board= "+result);
				
	}
	
}
