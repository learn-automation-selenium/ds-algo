package array;

public class NoOfBottles {

	public static void main(String[] args) {
		int bottles = numWaterBottles(15, 4);
		System.out.println(bottles);

	}

	public static int numWaterBottles(int numBottles, int numExchange) {
		int ans = numBottles;
		int empty = numBottles;
		while (empty >= numExchange) {
			int newBottles = empty / numExchange;
			ans += newBottles;
			empty = newBottles + empty % numExchange;
		}
		return ans;
	}

}
