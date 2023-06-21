package DataStructureAndAlgorithm;

import java.util.Scanner;

public class binnarySearch {
//Binnary search algorithm
	public static int binarySearchAlgo(int arr[], int target) {

		int low = 0;
		int high = arr.length;
		while (low <= high) {
			int mid = low + (high-low) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;
	}

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

		int result = binarySearchAlgo(arr, x);

		if (result == -1) {
			System.out.println("Searched value not found in Array");
		} else {
			System.out.println("value found at =" + result);
		}

	}
}
