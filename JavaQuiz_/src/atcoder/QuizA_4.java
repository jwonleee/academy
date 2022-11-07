package atcoder;

import java.util.Scanner;

public class QuizA_4 {

	public static void main(String[] args) {
		// 조깅
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row1 = scan.nextLine();

		int a = Integer.parseInt(row1.split(" ")[0]); // String의 배열이 나옴
		int b = Integer.parseInt(row1.split(" ")[1]); // String의 배열이 나옴
		int c = Integer.parseInt(row1.split(" ")[2]); // String의 배열이 나옴

		int d = Integer.parseInt(row1.split(" ")[3]); // String의 배열이 나옴
		int e = Integer.parseInt(row1.split(" ")[4]); // String의 배열이 나옴
		int f = Integer.parseInt(row1.split(" ")[5]); // String의 배열이 나옴

		int x = Integer.parseInt(row1.split(" ")[6]); // String의 배열이 나옴

		// 로직처리
		int s1 = a + c; // 다카하시 초
		int s2 = d + f; // 아오키 초

		int result = 0;
		int result2 = 0;


		for(int i=0; i<=x; i+=a+c) { // 총 거리m
			if(x-i < a) {
				result += (x-i)*b;
			
			}else{
				result += a * b;
			}
		}

		for(int j=0; j<=x; j+=d+f) { // 총 거리m
			if(x-j < d) {
				result2 += (x-j) * e;
			}else{
				result2 += d * e;
			}
		}
		
		System.out.println(result2);
		System.out.println(result);
		
		if(result == result2) {
			System.out.println("Draw");
		} else if (result > result2) {
			System.out.println("Takahashi");
		} else {
			System.out.println("Aoki");
		}

		
	
	}
}
