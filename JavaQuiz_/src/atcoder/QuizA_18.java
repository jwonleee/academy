package atcoder;

import java.util.Scanner;

public class QuizA_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("갑을 입력하세요> ");
		String row = scan.nextLine();

		int s = Integer.parseInt(row.split(" ")[0]);
		int t = Integer.parseInt(row.split(" ")[1]);
		int x = Integer.parseInt(row.split(" ")[2]);

		
		if(s == x) {
			System.out.println("yes");
		} else if(t == x) {
			System.out.println("no");
		}

		if(s < t) {
			if(x > s && x < t) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} else if (s > t) {
			if(x > s && x < t || x < t && x < s || x > t && x > s) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}	

		
	}
}
