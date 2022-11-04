package atcoder;

import java.util.Scanner;

public class QuizA_3 {

	public static void main(String[] args) {
		// 4개의 점
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		String row3 = scan.nextLine();
		
		int x1 = Integer.parseInt(row1.split(" ")[0]); // String의 배열이 나옴
		int y1 = Integer.parseInt(row1.split(" ")[1]); // String의 배열이 나옴
		
		int x2 = Integer.parseInt(row2.split(" ")[0]); // String의 배열이 나옴
		int y2 = Integer.parseInt(row2.split(" ")[1]); // String의 배열이 나옴
		
		int x3 = Integer.parseInt(row3.split(" ")[0]); // String의 배열이 나옴
		int y3 = Integer.parseInt(row3.split(" ")[1]); // String의 배열이 나옴
		
		
		// 로직 처리
		int x4 = 0;
		int y4 = 0;
		
		if (x1 == x2) {
			x4 = x3;
		} else if (x2 == x3) {
			x4 = x1;
		} else if (x1 == x3) {
			x4 = x1;
		}
		
		if (y1 == y2) {
			y4 = y3;
		} else if (y2 == y3) {
			y4 = y1;
		} else if (y1 == y3) {
			y4 = y1;
		}
		
		
		// 출력
		System.out.println(x4 + " " + y4);
		
		
	}
}
