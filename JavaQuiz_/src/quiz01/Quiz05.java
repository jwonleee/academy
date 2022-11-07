package quiz01;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 각각 입력을 받습니다.
		 * 같은 정수는 없다고 가정을 합니다.
		 * 
		 * 가장 큰값, 중간값, 가장 작은값을 구분해서 출력. (순서 상관X)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0; // 변수 지정
		int mid = 0;
		int min = 0;
		
		if((a > b) && (a > c)) {
			max = a;
			if(b > c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;
			}
		} else if(b > a && b > c) { // ( )&&( ) 중괄호 없어도 됨
			max = b;
			if(a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
			}
		} else if(c > a && c > b) {
			max = c;
			if(a > b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println("가장 큰값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("가장 작은값: " + min);
		
		
	}
}
