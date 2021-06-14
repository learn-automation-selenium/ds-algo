package string;

public class NoOfWordsInUpperCase {

	public static void main(String[] args) {
		String str = "ThisIsCamelCaseString";
		getNoOfWords(str);
	}

	public static void getNoOfWords(String str) {
		int counter = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
