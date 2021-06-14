package searchalgorithm;

public class BinarySearch {

	public int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		
		while(start<=end) {
			mid = (start + end) / 2;
			if(arr[mid]==key) {
				return 1;
			}
			
			if(arr[mid]<key) {
				start = mid + 1;
			} else {
				end = mid -1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] arr = {0, 10, 20, 27, 39, 50, 60, 65, 69, 71, 77, 89, 99};
		int key = 51;
		if(bs.binarySearch(arr, key)==1) {
			System.out.println("element " + key + " found in binary search");
		} else {
			System.out.println("element " + key + " not found in binary search");
		}
	}
}