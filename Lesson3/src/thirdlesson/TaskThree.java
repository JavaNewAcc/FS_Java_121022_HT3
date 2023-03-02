package thirdlesson;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		int sideA;
		int sideB;
		int sideC;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть довжину сторони A:");
		sideA = scan.nextInt();
		System.out.println("Введіть довжину сторони B:");
		sideB = scan.nextInt();
		System.out.println("Введіть довжину сторони C:");
		sideC = scan.nextInt();

		if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
			System.out.println("Довжина сторони не може бути менше 0");
		} else {
			if ((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC) > sideB) {
				System.out.println("Трикутник зі сторонами " + sideA + ", " + sideB + " та " + sideC + " існує");
			} else {
				System.out.println("Трикутник зі сторонами " + sideA + ", " + sideB + " та " + sideC + " не існує");
			}
		}
	}
}
