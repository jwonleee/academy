package day02;

public class WhileEx03 {

	public static void main(String[] args) {
		
		// 1~100까지의 정수 중 3의 배수의 개수 구하기

		int count = 0; // 개수를 체크할 변수
		
		int i = 1;
		while(i <= 100) {
			
			if(i % 3 == 0) { // i는 3의 배수
				count++; // 특정 조건(3의 배수)에서 하나씩 카운트 하겠다.
			}
			
			i++;
			
		}
		
		System.out.println("3의 배수의 개수: " + count);
		
	}
}
