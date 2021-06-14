package array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {1,1,1,3,3,5,5};
		System.out.println(rmDuplicates(arr, arr.length));

	}
	
	public static int rmDuplicates(int[] arr, int n) {
		int len=0;
		
		if(n==0 || n==1) {
			return n;
		}
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				len++;
			}
		}
		len++;
		
		return len;
	}

}
