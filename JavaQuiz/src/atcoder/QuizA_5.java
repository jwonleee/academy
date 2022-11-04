package atcoder;

import java.util.Scanner;

public class QuizA_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row1 = scan.nextLine();
		
		int v = Integer.parseInt(row1.split(" ")[0]);
		int a = Integer.parseInt(row1.split(" ")[1]);
		int b = Integer.parseInt(row1.split(" ")[2]);
		int c = Integer.parseInt(row1.split(" ")[3]);
		
		
		
		// 로직 처리
//		int sum = a+b+c;
		
		for(int i = 1; i <= v; i++) {
			if(v-a >= 0) {
				v =- a;
			} else {
				System.out.println("F");
				break;
			}
			
			if(v-b >= 0) {
				v =- b;
			} else {
				System.out.println("M");
				break;
			}
			
			if(v-c >= 0) {
				v =- c;
			} else {
				System.out.println("T");
				break;
			}
			
		}
		
		
		
		
		
		// 출력문
		
		
	}
}
