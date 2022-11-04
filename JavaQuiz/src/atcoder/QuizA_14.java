package atcoder;

import java.util.Scanner;

public class QuizA_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		
		int a = Integer.parseInt(row.split("")[0]);
		String x = row.split("")[1];
		int b = Integer.parseInt(row.split("")[2]);
		
		System.out.println(a*b);
		
	}
}
