package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicateEntry2 {

	public static void getDuplicateItemsFromArray(String str) {
		String[] arr = str.split(";")[1].split(",");
		Set<String> uniqueElemnts = new LinkedHashSet<String>();
		
		for (String s : arr) {
			if (uniqueElemnts.contains(s)) {
				System.out.println(s);
			} else {
				uniqueElemnts.add(s);
			}
		}
		
	}
	
	public static void getDuplicateItemsFromArray1(String str) {
		String[] arr = str.split(";")[1].split(",");
		Set<String> uniqueElemnts = new HashSet<String>();
		
		for (String s : arr) {
			if(!uniqueElemnts.add(s)) {
				System.out.println(s);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String arrStr = "5;0,1,2,3,3,0,0";
		getDuplicateItemsFromArray(arrStr);
		System.out.println("-------------------");
		getDuplicateItemsFromArray1(arrStr);
	}

}
