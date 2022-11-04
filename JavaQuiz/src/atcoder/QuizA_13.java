package atcoder;

import java.util.Scanner;

public class QuizA_13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		
		int x = Integer.parseInt(row.split(" ")[0]); // x엔 짜리 우표
		int y = Integer.parseInt(row.split(" ")[1]); // y엔 이상의 우표
		
		int z = y - x; // 남은값
		int count = 0;
		
		for(int i = 1; i <= z; i++) {
			if(z - 10*i > 0 ) {
				count++;
			} else {
				count++;
				break;
			}
		}
		
		System.out.println(count);
		
	}
}
