package quiz01;
import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
//		두 수를 입력받습니다.
//		두 수 사이의 합을 구하세요.
//		10 13 -> 10 + 11 + 12 + 13
//		13 10 -> 10 + 11 + 12 + 13
		
//		int max = (a > b ? a : b);  -> 삼항 연산자
//		int min = (a > b ? b : a);
//		1. 큰 수, 작은 수 비교
//		2. 작은수 ~ 큰수 반복
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum = 0;
		
		int max = (a > b ? a : b); // 항상 큰 수
		int min = (a > b ? b : a); // 항상 작은 수
		
		while( min <= max ) {
			sum += min; 
				min++;
			}
		
		System.out.println("-> " + sum);
			
		}
		
}

