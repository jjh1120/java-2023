package s0417;

import java.util.Scanner;

public class sssss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = 0, i = 0;
		System.out.println("정수 5개를 입력해 주세요.");

		while (i < 5) {
			System.out.print((i + 1) + "번째 정수:");
			num[i] = sc.nextInt();
			if (max < num[i])
				max = num[i];

			i++;
		}
		System.out.println("입력한 값들 중 최대값은" + max + "입니다");

	}

}
