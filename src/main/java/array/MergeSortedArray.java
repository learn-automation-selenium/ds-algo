package array;

public class MergeSortedArray {

	public static int[] mergeSortedArrays(int[] arr1, int arr1Size, int[] arr2, int arr2Size) {
		int[] resultArray = new int[arr1Size + arr2Size];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1Size && j < arr2Size) {
			if(arr1[i] < arr2[j]) {
				resultArray[k] = arr1[i];
				i++;
			} else {
				resultArray[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < arr1Size) {
			resultArray[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2Size) {
			resultArray[k] = arr2[j];
			j++;
			k++;
		}
		return resultArray;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8};
		int arr1Length = arr1.length;
		int arr2Length = arr2.length;
		printArray(mergeSortedArrays(arr1, arr1Length, arr2, arr2Length));
	}

	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
