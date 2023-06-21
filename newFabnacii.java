package DataStructureAndAlgorithm;

import java.util.Scanner;

public class newFabnacii {

	public static int fab(int num)
	{
		if(num<=1)
		{
			return num;
		}
		else {
			return fab(num-1)+fab(num-2);
		}
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter any number; ");
		int num=scr.nextInt();
		System.out.println(fab(num));
	}
}
