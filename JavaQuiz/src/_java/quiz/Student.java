package _java.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		double average = 0.0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.                      분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = scan.nextInt();
				scores = new int[studentNum]; //score라는 변수에 [크기 지정]가 크기만큼 생성
				
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scan.nextInt();
				}
				
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			} else if(selectNo == 4) {
				for(int i = 1; i < scores.length; i++) {
					if(scores[0] < scores[i]) {
						max = scores[i];
					} else {
						max = scores[0];
					}
				}
				
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				average = (double)sum / selectNo;
				
				System.out.println("최고점수: " + max);
				System.out.println("평균점수: " + average );
				
			} else if(selectNo == 5) {
				scan.close();
				run = false;
				
			} else {
				System.out.println("1~5중에서 선택하세요!!!");
			}
		}          
		
		System.out.println("프로그램 종료");
	}
}
