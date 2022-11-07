package quiz01;
import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
//		for~~~>
//		1. 7~100까지 정수 중의 7의 배수를 가로로 출력
		for(int i = 7; i <= 100; i++) { 
			
			if(i % 7 == 0) {
			System.out.print(i + " ");
//		for(int i = 7; i <= 100; i+=7) {
//			System.out.print(i + " "); }
			}
		}
		
		
		System.out.println();
		
//		2. 1~200까지 정수 중의 9의 배수의 개수를 출력
		int count = 0; // 카운트 변수의 위치 확인
		
		for(int j = 1; j <= 200; j++) {
			
			if(j % 9 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
//		3. 50~100까지 두 수 사이의 합
		int sum = 0;
		
		for(int k = 50; k <= 100; k++) {
			sum += k;
		}
		System.out.println(sum);
		
		
//		4. char변수를 활용해서 A~Z까지 출력 A=65, Z=90
		for(char text = 'A'; text <= 'Z'; text++) {
			System.out.print(text + " ");
		}
		
		
		System.out.println();
		
//		5. 어떤수를 입력받아서 입력받은 수의 구구단을 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단> ");
		int num = scan.nextInt();
		
		for(int p = 1; p <= 9; p++) {
			int x = num * p;
			System.out.printf("%d x %d = %d\n", num, p, x);
//			System.out.println(num + " x " + p + " = " + num*p);
		}
	}
}
