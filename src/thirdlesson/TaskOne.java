package thirdlesson;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		int value1;
		int value2;
		int value3;
		int value4;
		int maxValue;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть перше число");
		value1 = scan.nextInt();
		System.out.println("Введіть друге чсло");
		value2 = scan.nextInt();
		System.out.println("Введіть третє число");
		value3 = scan.nextInt();
		System.out.println("Введіть четверте число");
		value4 = scan.nextInt();

		maxValue = value1;
		if (value2 > maxValue) {
			maxValue = value2;
		}
		if (value3 > maxValue) {
			maxValue = value3;
		}
		if (value4 > maxValue) {
			maxValue = value4;
		}
		System.out.println("Максимальне число: " + maxValue);
	}
}