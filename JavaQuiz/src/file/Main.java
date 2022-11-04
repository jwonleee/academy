package file;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// a~z까지 돌리면 됨
		
		
		Scanner scan = new Scanner(System.in);
		
//		String[] arr = str.split("");
		
				 
//		int[] arr = new int[26];
//						
//			for(int i = 0; i < arr.length; i++) {
//				arr[i] = -1;
//			}
//				 
//		String S = scan.nextLine();
//				 
//		for(int i = 0; i < S.length(); i++) {
//			char ch = S.charAt(i);
//				    
//			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
//				arr[ch - 'a'] = i;
//			}
//		}
//				 
//		for(int val : arr) {	// 배열 출력
//			System.out.print(val + " ");
//		}

	        String S = scan.next();
	        for (char i = 'a' ; i <= 'z' ; i++)
	            System.out.print(S.indexOf(i) + " "); // 앞에서부터 찾는 문자의 위치 확인, 없으면 -1
	
		

	}

}
