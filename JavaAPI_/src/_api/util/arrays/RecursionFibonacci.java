package _api.util.arrays;

public class RecursionFibonacci {

	// n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static int fibonacci(int n) {
		// 첫번째 와 두번째는 1
		if(n == 1 || n == 2) {
			return 1;
		}
		// 세번째 부터는 앞의 2개의 항의 합
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		// 시간제한이 있는 경우 재귀는 사용하지 않는게 좋음
		System.out.println(fibonacci(100)); // 오버플로우 발생
	}
}
