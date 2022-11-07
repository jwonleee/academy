package quiz01;

public class Quiz10 {

	public static void main(String[] args) {
		
//		금액을 가장 큰 금액부터 나누어서 각 동전별로 몇개가 나와야 하는지 출력.
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		
//		몫, 나머지
//		1번째
//		17780 / 1000 17개
//		money = 17780 % 1000 -> 780원
//		2번째
//		780 / 500 1개
//		money = 780 % 500 -> 280원
		
		int i = 0;
		
		while(i < arr.length) {
			
			System.out.println(arr[i] + "원: " + money / arr[i] + "개");
			money %= arr[i]; // 나머지
			
//			money /= arr[i]; // 이렇게 하면 안 됨.
//			첫번째 행에서 단지 몫을 출력 -> 나머지를 money에 저장			
//			System.out.println( arr[i] + "원 : " + money ); // 틀림
			
			i++;
		}
		
	}
	
}
