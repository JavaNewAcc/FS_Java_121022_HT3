package thirdlesson;

import java.util.Scanner;

public class AddTaskThree {

	public static void main(String[] args) {
		int r = 4;
		int x;
		int y;

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Для перевірки, чи потрапляє точка в коло з центром на початку координат і радіусом 4, введіть:");
		System.out.println("Координату X Вашої точки:");
		x = scan.nextInt();
		System.out.println("Координату Y Вашої точки:");
		y = scan.nextInt();

		if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= r) {
			System.out.println("Ваша точка знаходиться в межах кола з центром на початку координат та радіусом 4");
		} else {
			System.out.println("Ваша точка знаходиться за межами кола");
		}
	}

}