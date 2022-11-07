package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class QuizA_1 {

	public static void main(String[] args) {
		// 부족한 숫자
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요> ");
		String row1 = scan.nextLine();
		
		
		// 로직 처리
		int sum = 45;
		int sum1 = 0;
		
		for(int i = 0; i < row1.length(); i++) {
			sum1 += (int)(row1.charAt(i) - '0');
		}
		
		
		// 출력
		System.out.println(sum - sum1);
		
		
		
	
	
	}
}
