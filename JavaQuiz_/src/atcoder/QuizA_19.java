package atcoder;

import java.util.Scanner;

public class QuizA_19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 사람 수
		int k = scan.nextInt(); // 카드 개수
		int a = scan.nextInt(); // 가장 먼저 받는 사람
		
		int result = a -1;
		for(int i = 0; i < k; i++) { // 0, 1, 2, 3, 4로 카드 다섯개를 줌
			result++; // 받은 사람의 숫자(이걸 맞추려고 a-1을 한 것)
			if(result > n) {
				result = 1;
			}
		}
		System.out.println(result);
	}
}


