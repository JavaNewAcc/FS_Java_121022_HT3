package thirdlesson;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		int price1;
		int price2;
		int price3;
		int maxPrice;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть ціну першого товару");
		price1 = scan.nextInt();
		System.out.println("Введіть ціну другого товару");
		price2 = scan.nextInt();
		System.out.println("Введіть ціну третього товару");
		price3 = scan.nextInt();

		maxPrice = price1;
		if (price2 > maxPrice) {
			maxPrice = price2;
		}
		if (price3 > maxPrice) {
			maxPrice = price3;
		}
		System.out.println("Максимальна ціна: " + maxPrice + " UAH");
	}
}
