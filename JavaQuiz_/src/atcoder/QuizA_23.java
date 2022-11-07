package atcoder;

import java.util.Scanner;

public class QuizA_23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		
		int x = scan.nextInt();
		
		if(x % 100 == 0 && x != 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
