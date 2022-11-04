package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class QuizA_26 { // 완벽한 문자열

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		
		String s = scan.nextLine();
		
//		하나의 문자열은 하나의 대문자 영어 알파벳을 포함한다.
//		하나의 문자열은 하나의 소문자 영어 알파벳을 포함한다.
//		하나의 문자열의 모든 문자는 두 번 이상 반복될 수 없다.
		
		char[] arr = s.toCharArray(); // char형식으로 담김
		
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i < arr.length; i++) {
//		}
		
		int i = 0;
		while(true) {
			if(Character.isUpperCase(arr[i]) || Character.isLowerCase(arr[i]) ) {
				System.out.println(true);
			}
			
			i++;
		}
		
		
	}
}
