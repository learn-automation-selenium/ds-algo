package array;

public class SmallestArray_WithGivenContraints {

	public static int arrayLength(int[] arr) {
		int length = 0;
		int diff = 0;
		for(int i=0; i< arr.length-1; i++) {
			diff += Math.abs(arr[i] - arr[i+1]);
		}
		length = 1 + diff;
		//length = 1 + Math.abs(arr[0]-arr[1]) + Math.abs(arr[1]-arr[2]);
		return length;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 9, 15};
		System.out.println(arrayLength(arr));

	}

}
