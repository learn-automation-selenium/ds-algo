package array;

public class SortArray {

	public static int[] sortArray(int[] arr) {
		int i = 0;
		int j = i + 1;
		int length = arr.length;
		while(i < length-1) {
			if(arr[j] < arr[i]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
			i++;
			j++;
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 5, 8, 3, 4, 2, 9};
		printArray(sortArray(arr));
	}

}
