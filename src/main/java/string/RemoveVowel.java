package string;

public class RemoveVowel {

	public static void main(String[] args) {
		System.out.println(removeVowel("youwillwinthis"));

	}
	
	public static String removeVowel(String str) {
		char[] arr = str.toCharArray();
		String vowelString = "aeiou";
		StringBuffer finalString = new StringBuffer();
		for(Character ch : arr) {
			String st = String.valueOf(ch);
			if(!vowelString.contains(st)) {
				finalString.append(st);
			}
		}
		
		return finalString.toString();
	}

}
