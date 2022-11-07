package day02;

public class BreakEx01 {
	
	public static void main(String[] args) {
		
//		int i = 1;
//		while(i <= 10) {
//			
//			if(i == 5) break; // if문은 조건이 1일때 { } 생략 가능
//			System.out.println(i); // 1, 2, 3, 4
////			break의 위치가 실행 전에 빠져나오는지 실행하고 빠져나오는지에 따라 결과 달라짐
//			
//			i++;
//		}
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i); // 1, 2, 3, 4, 5
			if(i == 5) break;
		}
		
	}

}
