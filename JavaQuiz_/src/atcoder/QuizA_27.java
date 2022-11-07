package atcoder;

import java.util.Scanner;

public class QuizA_27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값 입력> ");
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		long k = scan.nextLong();
		
		int count = 0;
		
		
		while(true) {
			if(a*k <= b) {
				count++;
				a = a*k;
			} else if (a >= b) {
				break;
			} else if (a*k > b) {
				count++;
				break;
			}
			
		}
		
		System.out.println(count);
	}
}
