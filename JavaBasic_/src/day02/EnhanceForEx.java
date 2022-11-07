package day02;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
//		일반 for
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		향상된 for
		for( int a : arr) {
			System.out.println(a);
		}

		System.out.println("---------------");
		
		String [] sArr = {"월","화","수","목","금","금"}; 
		for( String s : sArr ) {
			System.out.println(s);
		}
		
		System.out.println("---------------");

//		배열 요소들의 합계와 평균을 소수 2자리만 출력
		int [] score = {34, 54, 23, 53, 65};
		
//		double sum = 0;
//		for( double b : score ) {
//			sum += b;
//		}
//		
//		System.out.printf("합계: " + "%.0f\n",sum);
//		System.out.printf("평균: " + "%.2f",sum/score.length); // 내 풀이
		
		int sum = 0;
		for( int i : score ) {
			sum += i;
		}
		
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.2f\n", (double)sum/score.length); // int -> double 캐스팅
	}
}
