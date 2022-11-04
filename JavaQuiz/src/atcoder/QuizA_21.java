package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class QuizA_21 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		
		String row = scan.nextLine();
		
		String a = row.split("")[0];
		String b = row.split("")[1];
		String c = row.split("")[2];
		
		int result = 0;
		
		if(a.equals(b) && b.equals(c) && c.equals(a)) {
			result = 1;
		} else if(a.equals(b) || a.equals(c) || b.equals(c)) {
			result = 3;
		} else {
			result = 6;
		}
		
		System.out.println(result);
		
	}


}
