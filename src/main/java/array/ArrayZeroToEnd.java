package array;

public class ArrayZeroToEnd {

	public void moveZeroToEnd(int[] arr) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 1, 0, 3, 0, 6, 5};
		printArray(arr);
		ArrayZeroToEnd arrayZeroToEnd = new ArrayZeroToEnd();
		arrayZeroToEnd.moveZeroToEnd(arr);
		printArray(arr);
	}

}
