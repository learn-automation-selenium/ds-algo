package array;

public class ArrayResize {

	public static int[] arrayResize(int[] arr, int newResize) {
		for(int i=0; i<newResize; i++) {
			if(i<arr.length) {
				arr[i] = i;
			} else {
				arr = resize(arr, newResize);
				return arr;
			}
		}
		return arr;
	}
	
	public static int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int newResize = 8;
		int[] arr = new int[6];
		arr = arrayResize(arr, newResize);
		printArray(arr);
	}

}
