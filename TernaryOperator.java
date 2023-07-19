// 9. The  Ternary Operator.

package hangmangame;

public class TernaryOperator {

	public static void main(String[] args) {
		System.out.println(false ? "yes" : "no");

		int value = 77;
		value = value > 60 ? 60 : value;
		System.out.println(value);

		int values[] = { 6, 3, 92, 63, 14 };
		int min = Integer.MAX_VALUE;

		for (int currentValue : values) {
			if (currentValue < min) {
				min = currentValue;
			}
			min = currentValue < min ? currentValue : min;

		}
		System.out.println(min);
	}

}
