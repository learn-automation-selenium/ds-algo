package string;

public class FizzBuzzTest {

	public static void main(String[] args) {
		printFizzBuzz(20);

	}
	
	static void printFizzBuzz(int n) {
		for (int i=1; i<=n; i++) {
			if(i%5==0 && i%3==0) {
				System.out.println("fizzbuzz");
			} else if (i%3==0) {
				System.out.println("fizz");
			} else if (i%5==0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
