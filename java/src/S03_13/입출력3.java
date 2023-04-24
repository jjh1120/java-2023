package S03_13;

import java.util.Scanner;
public static void main(String[] args) {

public class 입출력3 {

		int num1, num2, num3;
		int sum;
		double avg;
		
		Scanner s=new Scanner(System.in);
		System.out.println("첫 번째 수 입력:");
		num1=s.nextInt();
		System.out.println("두 번째 수 입력:");
		num2=s.nextInt();
		System.out.println("세 번째 수 입력:");
		num3=s.nextInt();
		sum= num1+num2+num3;
		avg=sum/3.0;
		
		
		System.out.printf("합계:%d 평균:%.1f", sum, avg);
		
	}

}
