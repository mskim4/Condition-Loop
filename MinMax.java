public class MinMax {
	public static void main(String[] args) {
		double x = 3.8, y = 4.9;
		double max = x > y ? x : y;
		double min = x > y ? y : x;

		System.out.printf("최대: %f\n", max);
		System.out.printf("최소: %f\n", min);
	}
}
