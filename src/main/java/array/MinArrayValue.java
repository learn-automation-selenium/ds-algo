package array;

public class MinArrayValue {

	public int getMinimumValue(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		int minValue = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] <minValue) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 45, 3, 6, 2, 7, 1};
		
		MinArrayValue minValue = new MinArrayValue();
		System.out.print(minValue.getMinimumValue(arr));

	}

}
