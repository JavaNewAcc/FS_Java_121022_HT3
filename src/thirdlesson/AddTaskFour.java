package thirdlesson;

import java.util.Scanner;

public class AddTaskFour {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int triangleAx = 0;
		int triangleAy = 0;
		int triangleBx = 4;
		int triangleBy = 4;
		int triangleCx = 6;
		int triangleCy = 1;

		int x;
		int y;

		int skewProductOAB;
		int skewProductOBC;
		int skewProductOCA;

		System.out.println(
				"Для перевірки, чи потрапляє точка в трикутник з наступники координатами вершин А(0,0), В(4,4) та С(6,1), введіть:");
		System.out.println("Координату X Вашої точки:");
		x = scan.nextInt();
		System.out.println("Координату Y Вашої точки:");
		y = scan.nextInt();

		int xAO = x - triangleAx;
		int yAO = y - triangleAy;
		int xAB = triangleBx - triangleAx;
		int yAB = triangleBy - triangleAy;

		int xBO = x - triangleBx;
		int yBO = y - triangleBy;
		int xBC = triangleCx - triangleBx;
		int yBC = triangleCy - triangleBy;

		int xCO = x - triangleCx;
		int yCO = y - triangleCy;
		int xCA = triangleAx - triangleCx;
		int yCA = triangleAy - triangleCy;

		skewProductOAB = xAO * yAB - yAO * xAB;
		skewProductOBC = xBO * yBC - yBO * xBC;
		skewProductOCA = xCO * yCA - yCO * xCA;

		if ((skewProductOAB <= 0 && skewProductOBC <= 0 && skewProductOCA <= 0)
				|| (skewProductOAB >= 0 && skewProductOBC >= 0 && skewProductOCA >= 0)) {
			System.out.println("Вказана точка належить заданому трикутнику");
		} else {
			System.out.println("Вказана точка НЕ належить заданому трикутнику");
		}
	}
}