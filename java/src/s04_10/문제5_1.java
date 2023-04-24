package s04_10;

import java.util.Scanner;

public class 문제5_1 {

	public static void main(String[] args) {
		System.out.print("숫자 입력:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;

		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
				System.out.print("+" + i);
			} else {
				sum -= i;
				System.out.print("-" + i);
			}
			i++;
		}
		System.out.println("=" + sum);

	}

}
