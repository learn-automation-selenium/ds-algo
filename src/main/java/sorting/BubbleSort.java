package sorting;

public class BubbleSort {

	public void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public void sort(int[] arr) {
		boolean isSwapped = false;
		int length = arr.length-1;
		for(int i=0; i<length; i++) {
			isSwapped = false;
			
			for(int j=0; j<length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
			}
			
			if(isSwapped == false) {
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = {2, 6, 23, 98, 24, 35, 78};
		bubbleSort.printArray(arr);
		bubbleSort.sort(arr);
		bubbleSort.printArray(arr);
	}

}
