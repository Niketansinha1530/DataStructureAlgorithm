package DataStructureAndAlgorithm;

public class Array2D01 {

	public static void main(String[] args) {
		
		int arr[][]= {{10,20,30,40,50},{60,70,80,90,100},{110,120,130,140,150},{160,170,180,190,200}};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		
	}
}
