package atcoder;

import java.util.Scanner;

//import java.util.Scanner;

public class QuizA_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row1 = scan.nextLine();
		
		int a = Integer.parseInt(row1.split(" ")[0]);
		int b = Integer.parseInt(row1.split(" ")[1]);
		int c = Integer.parseInt(row1.split(" ")[2]);
		int x = Integer.parseInt(row1.split(" ")[3]);
		
		double answer = 0;

		if(x <= a) {
			answer = 1;
		} else if(x > b) {
			answer = 0;
		} else if(x>a && x<b) {
			answer = (double) c / (b-a);
		}

		System.out.printf("%.12f", answer);

		
	}
}
