package quiz01;
import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤한 덧셈 문제를 내는 프로그램
		 * 
		 * 반복이 실행될때마다 1~100사이의 랜덤한 덧셈 구문이 출력됩니다.
		 * 0을 입력받으면 프로그램을 종료합니다.
		 * 프로그램이 종료되면 정답횟수, 오답횟수를 출력하면 됩니다. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0; // 정답횟수
		int count2 = 0; // 오답횟수
		
		while(true) {
			int ran = (int)(Math.random() * 100) + 1;
			int ran2 = (int)(Math.random() * 100) + 1; // 반복이 돌아갈때마다 초기화가 된다.
			
			System.out.println(ran + " + " + ran2 + " = " + " ? " );
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요");
			System.out.print("> ");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답: " + count );
				System.out.println("오답: " + count2 );
				break; // 탈출하는 구문을 중간이나 마지막에 넣으면 if문 실행이 안됨
				
			} else if(answer == ran + ran2) {
				System.out.println("정답입니다");
				System.out.println("------------");
				count++;
				
			} else if(answer != ran + ran2) {
				System.out.println("틀렸는데요?");
				System.out.println("------------");
				count2++;
			}
			
			scan.close();
		}
		
		
//		선생님 답
//		
//		while문 안에서
//			if(answer == 0) break; // 탈출
//		
//			정답 or 오답
//			if(answer == ran + ran2) {
//				System.out.println("정답");
//				count++;
//				} else if(answer != ran + ran) {
//				System.out.println("오답");
//				count2++;
//				}
//		
//		while문 밖에서
//			System.out.println("프로그램 정상 종료");
//			System.out.println("정답: " + count );
//			System.out.println("오답: " + count2 );
		
		
	}
}
