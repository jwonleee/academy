package day02;

import java.util.Scanner;

public class MultiForEx03 {

	public static void main(String[] args) {
		
//		입력받은 수까지 소수를 출력
//		소수: 나누어 떨어지는 수가 1과 자기자신인 수
//		ex) 5 -> 2 3 5
//		(밖)입력받은 수까지 반복하고, (안)각 수를 자기자신까지 나누면서 약수의 개수가 2개인 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수> ");
		int num = scan.nextInt();
		
		
		for(int i = 1; i <= num; i++) {
			
			int count = 0; // 카운트 초기값을 0으로

			for(int j = 1; j <= i; j++) {
				
				System.out.println(i + "-" + j);
				if(i % j ==0) {
					count++;
				}
			} //inner for
			
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
}
