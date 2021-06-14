package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "civic";
		StringPalindrome palindrome = new StringPalindrome();
		if(palindrome.isPalindrome(str)) {
			System.out.println("String is Palindrome!!!");
		} else {
			System.out.println("String is not Palindrome!!!");
		}
	}
	
	public boolean isPalindrome(String word) {
		char[] charArray = word.toCharArray();
		int start = 0;
		int end = word.length()-1;
		
		while(start < end) {
			if(charArray[start] != charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
