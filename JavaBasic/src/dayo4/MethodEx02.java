package dayo4;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수 (parameter)
		 * 1. 매개변수는 메서드를 호출할 때 필요한 값을 전달하는 매개체
		 * 2. 매개변수는 몇 개 받을지 메서드를 선언할 때 결정해 줍니다.
		 */

		int sum = 0;
		int end = 10;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		int result = calSum(10);
		System.out.println("1~10까지 합: " + result); // 55
		
		int result2 = calSum(100);
		System.out.println("1~100까지 합: " + result2); // 5050
		
		//calSum2();
		int result3 = calSum2(10, 20);
		System.out.println("10~20까지 합: " + result3);
		
	}
	
	
	
//	반환 O, 매개변수 O
	static int calSum(int end) { // 선언만 함(타입 이름) 나중에 호출할때 넣어줘야함 = 10
		
		int sum = 0;

		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
//	반환 O, 매개변수 O - 매개변수가 여러개
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
}
