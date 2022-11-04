package day02;

import day01.SystemOut;

public class ContinueEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) { // 짝수 일때는 출력
//			
//			if(i % 2 == 1) { // 홀수
//				continue; // 다음 반복으로 pass
//			}
//			System.out.println(i);
//			
//		}
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 1) {
				i++;
				 continue;
//				return; // 메인의 종료
			}
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
}
