package string;

public class ReverseIndividualWords2 {

	public static void main(String[] args) {
		String str = "Programming is an Art";
		char[] ch = str.toCharArray();
		reverse_words(ch);
	}

	static void reverse_words(char str[])
	{
		
		String sampleString = String.valueOf(str);
		String[] subString = sampleString.split(" ");
		String str1 = "";
		for(int i=0; i<subString.length; i++) {
			String newString = subString[i];
			for(int j=newString.length()-1; j>=0; j-- ) {
				str1 += newString.charAt(j);
			}
			str1 += " ";
		}
		System.out.println(str1);


	}
}
