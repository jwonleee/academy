package day02;

public class MultiForEx02 {

	public static void main(String[] args) {
		
//		회전할 때마다 횟수가 변하는 중첩반복문
		/*
		 *	   *	
		 * 	  ***
		 * 	 *****
		 * 	*******
		 * *********
		 */
		
		int star = 5; // 변수 사용시 변경할 때 규칙에 맞게 찍어줌
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= star-i; j++) { // 공백
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i*2-1; j++) { // 별
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
		
		System.out.println("--------------------");
		
		/*				i  공백j  별j
		 * *********    1   0    9
		 *  *******     2   1    7
		 *   *****      3   2    5
		 *    ***       4   3    3
		 *     *        5   4    1
		 */
		
		int star2 = 5;
		for(int i = 1; i <= star2; i++) {
			
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" "); // 공백
			}
			
			for(int j = 1; j <= (star2-i)*2+1 ; j++) { // 식 만들기(-1아니고 +1임)
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
		
	}
}
