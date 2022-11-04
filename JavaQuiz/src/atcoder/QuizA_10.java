package atcoder;

import java.util.Scanner;

public class QuizA_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		
		int a = Integer.parseInt(row.split("")[0]); // 1
		int b = Integer.parseInt(row.split("")[1]); // 2
		int c = Integer.parseInt(row.split("")[2]); // 3

		
		int answer = a*100 + b*10 + c;
		int answer2 = b*100 + c*10 + a;
		int answer3 = c*100 + a*10 + b;

		System.out.println(answer + answer2 + answer3);
		
		
	}
}
