package atcoder;

import java.util.Scanner;

public class QuizA_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();

		int a = Integer.parseInt(row);
		double answer = Math.sqrt(a*((double)12800000+a));

		System.out.printf("%.9f",answer);

	}
}
