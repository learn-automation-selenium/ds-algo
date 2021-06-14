package array;

import java.util.HashMap;
import java.util.Map;

public class Indices_Target {

	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		int target = 9;
		int[] indices = getIndices(arr, target);
		System.out.println(indices[0] + " " + indices[1]);
	}
	
	public static int[] getIndices(int[] arr, int target) {
		int[] indices = new int[2];
		
		Map<Integer, Integer> targetMapp = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			if(!targetMapp.containsKey(target - arr[i])) {
				targetMapp.put(arr[i], i);
			} else {
				indices[0] = i;
				indices[1] = targetMapp.get(target - arr[i]);
			}
		}
		return indices;
	}

}
