package lec01;

import java.util.Scanner;

public class eight {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numFac = 0;
		int div = 1;
		while (div <= n) {
			int rem = n % div;
			if (rem == 0) {
				numFac++;
			}

			div++;

		}
		System.out.println(numFac);

	}
}
