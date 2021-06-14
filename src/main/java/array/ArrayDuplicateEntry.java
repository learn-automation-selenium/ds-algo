package array;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicateEntry {

	public static void getDuplicateItemsFromArray(String str) {
		int length = Integer.parseInt(str.split(";")[0]);
		String[] arr = str.split(";")[1].split(",");
		
		Map<Integer, String> mapp = new HashMap<Integer, String>();
		int count = 0;
		for(int i=0; i<length; i++) {
			if(!mapp.containsValue(arr[i])) {
				mapp.put(count, arr[i]);
				count++;
			} else {
				for(Map.Entry<Integer, String> entry : mapp.entrySet()) {
				    String value = entry.getValue();
				    Integer key = entry.getKey();
				    if(value.equals(arr[i])) {
				    	System.out.println(key);
				    	System.out.println(i);
				    	//break;
				    }
				}
			}
		}
	}
	
	public static void test() {
		for (int x = 0;x<7;x++,x++ ) 
        {
            System.out.print(" " + x);
        }
	}
	public static void main(String[] args) {
		String arrStr = "6;0,1,2,3,0,0";
		//getDuplicateItemsFromArray(arrStr);
		test();
	}

}
