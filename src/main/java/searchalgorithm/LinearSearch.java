package searchalgorithm;

public class LinearSearch {

	public int linearSearch(int[] arr, int size, int value) {

		for (int i = 0; i < size; i++) {
			if (arr[i] == value) {
				return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 6, 2, 1, 9, 4, 2 };
		LinearSearch ls = new LinearSearch();
		if (ls.linearSearch(arr, arr.length, 10) == 1) {
			System.out.println("Search result found");
		} else {
			System.out.println("Search result not found");
		}
	}
}
