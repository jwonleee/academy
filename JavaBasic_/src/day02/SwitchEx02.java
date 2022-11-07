package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
//		IfEx02와 동일하게 실행되도록
//		switch 구문으로 변경. 몫을 구하기 point/10
//		100은 고려x
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수> ");
		int point = scan.nextInt();
		
//		혹은 point = point / 10;로 정의해서 만들기
		
		String grade = null;
		
		switch (point / 10) {
		case 9: // 90~99
			
			if(point >= 95) {
				grade = "A+";
			} else { // 90~94
				grade = "A";
			}
			break;

		case 8: // 80~89
			grade = "B";
			break;
			
		case 7: // 70~79
			grade = "C";
			break;
			
		case 6: // 60~69
			grade = "D";
			break;
			
		default:
			grade = "F";
			break;
		}
		
		System.out.println(grade);
		
	}
}
