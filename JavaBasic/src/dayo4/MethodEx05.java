package dayo4;

public class MethodEx05 {

	public static void main(String[] args) {
		
//		메서드의 (동기적) 실행
		test01();
//		메서드의 재귀적 실행
		recursive(0);
		
		int result = fac(5);
		System.out.println(result);
		
	}

	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	static void test02() {
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}

	static void recursive(int a) {
		// 재귀적 함수는 탈출의 구문을 반드시 명시한다.
		if(a == 10) return;
		
		System.out.println(a + "번 호출");
		
		a++; // 1증가
		recursive(a); // 다시 나 자신 실행
		
	}
	
	static int fac(int a) {
		if(a == 1) return 1; // f(1) = 1
		return a * fac(a-1);
	}
	
}
