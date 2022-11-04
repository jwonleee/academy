package atcoder;

import java.util.Scanner;

public class QuizA_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		
		int x = Integer.parseInt(row);
		
		double d = x / (double)100;
		System.out.print(d);
		
	}
	
	
}
