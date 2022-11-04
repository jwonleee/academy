package quiz01;
import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		/* 어려움
		 * 정수 형태로 입력을 2개 받습니다.
		 * 첫번째=가로길이, 두번째=세로길이
		 * 
		 * 입력받은 가로, 세로 길이의 사각형을 출력하면 됩니다.
		 * 단, 윤곽만 출력합니다.
		 * 
		 * 힌트 -> 1행, 마지막행, 1열, 마지막열만 출력 / 공백도 문자임
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로> ");
		int a = scan.nextInt();
		
		System.out.print("세로> ");
		int b = scan.nextInt();
		
		for(int i = 1; i <= b; i++) { // 세로(행)
			
			for(int j = 1; j <= a; j++) { // 가로(열)
				
				if(i == 1 || i == b || j == 1 || j == a) { // 넷중에 하나만 만족하면 * 찍으면 됨
					System.out.print("*");                // 1행, 마지막행, 1열, 마지막열
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println(); // 가로 찍고 줄바꿈
		}
		
	}
}
