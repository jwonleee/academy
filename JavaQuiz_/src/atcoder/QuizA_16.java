package atcoder;

import java.util.Scanner;

public class QuizA_16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		
		int n = scan.nextInt();
		
		if( n < 42 ) {
			System.out.printf("AGC%03d%n",n);
		} else if(n > 42) {
			System.out.printf("AGC%03d%n",n+1);
		}
		
		
	}
}
