package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 첫행의 입력값은 배열의 크기가 됩니다.
		 * 
		 * 배열의 크기만큼 반복을 돌면서, 입력받은 수들을 배열에 순서대로 저장.
		 * 
		 * 5 -> 배열의 크기
		 * 10 -> arr[0] => 반복
		 * 20
		 * 30
		 * 40
		 * 50 -> arr[4] => 반복
		 * 
		 * arr = {10, 20, 30, 40, 50}
		 */
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size]; // int[] arr = {10,20,30,40,50};
		
		int i = 0; //인덱스 0부터 시작, line=인덱스 개수
		while(i < arr.length) {
			
			int a = scan.nextInt();
			arr[i] = a;
			
			i++;
		}
		
		System.out.println( Arrays.toString(arr) );
		
	}
}
