package timecomplexity;

public class Sum_Of_Natural_Numbers {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		
		Sum_Of_Natural_Numbers sum = new Sum_Of_Natural_Numbers();
		System.out.println(sum.findSum2(99999));
		
		System.out.println("Time taken : " + (System.currentTimeMillis() - now) + " milli seconds");
	}
	
	public int findSum1(int n) {
		return n * (n+1) / 2;
	}
	
	public int findSum2(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}

}
