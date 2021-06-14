package array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static boolean compareTwoArrays(int[] arr1, int[] arr2) {
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		
		if(arr1Length != arr2Length) {
			throw new IllegalArgumentException("Two arrays are not equal in size");
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3};
		int[] arr2 = {2, 1, 3};
		
		System.out.println(compareTwoArrays(arr1, arr2));
	}

}
