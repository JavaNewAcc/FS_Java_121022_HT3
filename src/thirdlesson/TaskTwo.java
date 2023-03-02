package thirdlesson;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		int floor;
		int entrance;
		int flatNum;
		int maxFlatNum = 4 * 9 * 5;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть номер квартири:");
		flatNum = scan.nextInt();

		if (flatNum > maxFlatNum || flatNum <= 0) {
			System.out.println("Квартири з номером " + flatNum + " в домі немає. Будь ласка, введіть номер від 1 до "+ maxFlatNum);
		} else {
			entrance = (flatNum - 1) / (4 * 9) + 1;
			floor = ((flatNum - 1) % (4 * 9) / 4 + 1);
			System.out.println("Квартира знаходиться у " + entrance + "-у під'їзді на " + floor + "-у поверсі.");
		}
	}
}