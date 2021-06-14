package string;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		String str = "Programming is an Art";
		char[] ch = str.toCharArray();
		reverse_words(ch);
	}

	static void reverse_words(char str[])
	{
		int start = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i] == ' ') {
				reverse(str, start, i-1);
				start = i+1;
			}
		}
		reverse(str, start, str.length-1);
	}
	
	static void reverse(char[] str, int start, int end) {
		while(start < end) {
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			start++;
			end--;
		}
		
	}
}
