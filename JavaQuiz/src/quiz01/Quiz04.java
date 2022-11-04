package quiz01;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 * 정수를 하나 입력받습니다.
		 * 입력받은 값이 0인지, 홀수인지, 짝수인지, 음수인지 구별하는 else if문
		 */
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("정수를 입력하세요");
	System.out.print(">");
	int a = scan.nextInt();
	
	if(a == 0) {
		System.out.println(a + "은 0 입니다.");
		} else if(a < 0) {
			System.out.println(a + "은 음수 입니다.");
		} else if(a % 2 == 0) {
			System.out.println(a + "은 짝수 입니다.");
		} else if(a % 2 != 0) { // or else만 적기
			System.out.println(a + "은 홀수 입니다.");
		}
	}
}

