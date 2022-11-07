package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
//		1~10 합계
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("----------------------------------");
		
//		10부터 1까지 반복
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
