// 10. Using The Ternary Operator.

// Java Program to find the max min using the ternary Operator

package hangmangame;

public class UsingTheTernaryOperatorToFindMaxMin {

	public static void main(String[] args) {
		int value[] = new int[] { 6, 3, 92, 63, 14 };
		int min = Integer.MAX_VALUE; // max value that a integer can hold no integer can be greatere than that.
		int max = Integer.MIN_VALUE; // min value that an integer can hold no integer is less that that.

		for (int currentValue : value) {
			min = currentValue < min ? currentValue : min;
			max = currentValue > max ? currentValue : max;
		}
		System.out.println("The Maximum value Calculated using ternary Operator is:" + min);
		System.out.println("The Minimum value Calculated using ternary Operator is:" + max);

	}

}
