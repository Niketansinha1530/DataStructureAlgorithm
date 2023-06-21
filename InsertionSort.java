package DataStructureAndAlgorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void InsertionSORT(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 15, 24, 12, 2, 7, 69, 42, 100 };

		InsertionSORT(arr);
		System.out.println("Sorted array: ");
		System.out.println(Arrays.toString(arr));
	}

}
