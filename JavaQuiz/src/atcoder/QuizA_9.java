package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class QuizA_9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row1 = scan.nextLine();
		String row2 = scan.nextLine();
		
		int a = Integer.parseInt(row2.split(" ")[0]); //String 배열에 저장
		int b = Integer.parseInt(row2.split(" ")[1]); //String 배열에 저장
		
		char[] arr = row1.toCharArray();
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		for(int i = 0; i < arr.length; i++) {
			int tmp = 0;
			
			if(i-1 == a) {
				tmp = a;
				a = b;
				b = tmp;
				
			} else if(i-1 == b) {
				tmp = b;
				b = a;
				a = tmp;
			}
		}
		
		char[] temp = new char[a-1];
		temp[0] = arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = temp[0];
	
		System.out.println(Arrays.toString(arr));
		
		
//		다른 답
		int c = Integer.parseInt(row2.split(" ")[0])-1;// 하나의 값만 가져오고 싶은 경우
		int d = Integer.parseInt(row2.split(" ")[1])-1;// split 이후 [숫자]를 사용하면 해당하는 순서의 값만 가져옴
		
		String[] str = row1.split("");
		
		String temp1 = str[c];
		str[c] = str[d];
		str[d] = temp1;
		String result1 = "";
		for(String s: str) { // for(자료형 변수명 : 배열명)
			result1 += s;
		}
		System.out.println(result1);
				
		
	}
}

