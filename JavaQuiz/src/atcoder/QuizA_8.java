package atcoder;

import java.util.Scanner;

public class QuizA_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		double n = Double.parseDouble(row);
		
		double i = Math.pow(2, 31);
		if(n>=-i && n<i-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	
}
