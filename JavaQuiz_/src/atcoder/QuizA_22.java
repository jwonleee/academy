package atcoder;

import java.util.Scanner;

public class QuizA_22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		
		if(row.endsWith("er")) {
			System.out.println("er");
		} else if(row.endsWith("ist")) {
			System.out.println("ist");
		}
		
	}
}
