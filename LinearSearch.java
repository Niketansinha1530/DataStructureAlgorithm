package DataStructureAndAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in Array: ");
		int n = sc.nextInt();
		// taking input from the user.
		System.out.println("Enter elements in Array");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// target elemetn from the user
		System.out.println("Enter the value which index value you want: ");
		int x = sc.nextInt();
		int idxe = -1;
		// implementation of linear search
		for (int i = 0; i < n; i++) {
			if (x == arr[i]) {
				idxe = i;
				break;
			}
		}

		if (idxe == -1) {
			System.out.println("Number not found inside array: ");
		} else {
			System.out.println("Number found  at " + idxe);
		}
	}

}
