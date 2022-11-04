package day02;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
			
//			int a = 1; // 제어변수: 반복문의 횟수를 결정할 변수
//			while(a <= 10) {
//				
//				System.out.println("hello" + a);
//				
//				a++; // 제어변수 조작을 통해 반복의 조건식이 언젠가 false가 되도록 처리
//			}
			
		
//		누적
		int i = 1;
		int sum = 0; // 누적할 변수

		while(i <= 10) {
			
			sum += i; // sum = sum + i; 왼쪽 오른쪽 같은 표현
			
			i++;
		}
		
		System.out.println("1~10까지의 합: " + sum);
		
		/*
		 * int sum = 0;
		 * 
		 * sum = sum + 1;
		 * sum = sum + 2;
		 * sum = sum + 3;
		 * sum = sum + 4;
		 * sum = sum + 5;
		 * sum = sum + 6;
		 * sum = sum + 7;
		 * sum = sum + 8;
		 * sum = sum + 9;
		 * sum = sum + 10;
		 */
			
		}
		
	}


