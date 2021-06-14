package string;

import java.util.HashMap;
import java.util.Map;

public class SumTwo {

	public static void main(String[] args) {
		int[] numbers = {2,5,11,7,10,15};
		
		SumTwo sumTwo = new SumTwo();
		int[] indices = sumTwo.getSum(numbers, 9);
		System.out.println("Indices are " + indices[0] + " and " + indices[1]);

	}
	
	public int[] getSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		for(int i=0; i<numbers.length; i++) {
			if(!(numberMap.containsKey(target-numbers[i]))) {
				numberMap.put(numbers[i], i);
			} else {
				result[0] = i;
				result[1] = numberMap.get(target-numbers[i]);
				return result;
			}
		}
		throw new IllegalArgumentException("Two numbers not found");
	}

}
