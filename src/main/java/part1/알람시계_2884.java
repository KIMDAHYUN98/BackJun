package part1;

import java.util.Scanner;

public class 알람시계_2884 {
	public static void main(String[] args) {
		int h, m;
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		m = sc.nextInt();

		sc.close();

		if (h == 0) {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println((h + 23) + " " + (m + 15));
			}
		} else {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else {
				System.out.println((h - 1) + " " + (m + 15));
			}
		}
	}
}
