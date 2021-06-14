package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		//arrayRotate(arr, arr.length, 3);
		
		List<Integer> a = new ArrayList<Integer>();
		/*
		 * a.add(41); a.add(73); a.add(89); a.add(7); a.add(10); a.add(1); a.add(59);
		 * a.add(58); a.add(84); a.add(77); a.add(77); a.add(97); a.add(58); a.add(1);
		 * a.add(86); a.add(58); a.add(26); a.add(10); a.add(86); a.add(51);
		 */
		for(int i=1; i<=5; i++) {
			a.add(i);
		}
        
		printArray(rotLeft2(a, 1));
		//rotateArray(arr, 1);
	}

	static void arrayRotate(int arr[], int n, int k) {

		for (int j = 1; j <= k; j++) {
			for (int i = n - 1; i > 0; i--) {
				int temp = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = temp;
			}
		}
		
	}
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		int count = 0;
		int length = a.size()-1;
		
		while(count<d) {
			int tempValue = a.get(length);
			a.set(length, a.get(count));
			a.set(length-1, tempValue);
			length--;
			count++;
		}
		return a;
	}
	
	public static List<Integer> rotLeft1(List<Integer> a, int d) {
		
		int length = a.size();
		for(int j=0; j<d; j++) {
			int count = 1;
			int temp = a.get(0);
			for(int i=0; i< length-1; i++) {
				a.set(i, a.get(i+1));
				if(count== (length-1)) {
					a.set(length-1, temp);
				}
				count++;
			}
		}
		return a;
	}
	
	
	public static List<Integer> rotLeft2(List<Integer> a, int d) {

		Collections.rotate(a, d);
		return a;
	}
	 
	
	public static int[] rotateArray(int[] arr, int d){
        // Because the constraints state d < n, we need not concern ourselves with shifting > n units.
        int n = arr.length;
        
        // Create new array for rotated elements:
        int[] rotated = new int[n]; 
        
        // Copy segments of shifted elements to rotated array:
        System.arraycopy(arr, d, rotated, 0, n - d);
        System.arraycopy(arr, 0, rotated, n - d, d);

        return rotated;
    }
	public static void printArray(List<Integer> objects) {
		for(int i=0; i<objects.size(); i++) {
			System.out.print(objects.get(i) + " ");
		}
		System.out.println("");
	}

}
