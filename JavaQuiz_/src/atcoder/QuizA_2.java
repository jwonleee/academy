package atcoder;

import java.util.Scanner;

public class QuizA_2 {

	public static void main(String[] args) {
		
		// 좋은 아침
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시간을 입력하세요> ");
		String time = scan.nextLine();
		
		int a = Integer.parseInt(time.split(" ")[0]); // String의 배열이 나옴
		int b = Integer.parseInt(time.split(" ")[1]);
		int c = Integer.parseInt(time.split(" ")[2]);
		int d = Integer.parseInt(time.split(" ")[3]);
		
		// 로직처리
		String i = "Takahashi";
		String j = "Aoki";
		
		if(a == c) {
			if(b > d) {
				System.out.println(j);
			} else {
				System.out.println(i);
			}
		} else if( a != c) {
			String result = a < c? i : j;
			System.out.println(result);
			
		}
		
		
		
		
		
		
		
		//출력
		
		
	}
}
