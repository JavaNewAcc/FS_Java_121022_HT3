package thirdlesson;

import java.util.Scanner;

public class AddTaskOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть ціле четирьохзначне число:");
		int number = scan.nextInt();
		int fourthFig = number % 10;
		int thirdFig = (number / 10) % 10;
		int secondFig = (number / 100) % 10;
		int firstFig = number / 1000;
		
		if (firstFig + secondFig == thirdFig + fourthFig) {
			System.out.println("Ви - власник щасливого квитка!");
		} else {
			System.out.println("Цей квиток не є щасливим. Спробуйте ще!");
		}
	}
}
