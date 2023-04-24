package s04_10;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		System.out.print("숫자 입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.print("+" + i);
			} else {
				sum -= i;
				System.out.print("-" + i);
			}

		}
		System.out.println("=" + sum);

	}

}
