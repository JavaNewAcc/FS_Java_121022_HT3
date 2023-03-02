package thirdlesson;

import java.util.Scanner;

public class AddTaskTwo {
	public static void main(String[] args) {
		System.out.println("Введіть число для перевірки:");
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int sixthFig = number % 10;
		int fifthFig = (number / 10) % 10;
		int fourthFig = (number / 100) % 10;
		int thirdFig = (number / 1000) % 10;
		int secondFig = (number / 10000) % 10;
		int firstFig = number / 100000;

		if (firstFig == sixthFig && secondFig == fifthFig && thirdFig == fourthFig) {
			System.out.println("Введене число - це паліндром.");
		} else {
			System.out.println("Введене число не є паліндромом.");
		}
	}
}
