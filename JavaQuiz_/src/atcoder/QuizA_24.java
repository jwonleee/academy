package atcoder;

import java.util.Scanner;

public class QuizA_24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		
		int len = 0;
		switch(len  = n.length()) {
			case 1: 
				System.out.println("000" + n);
				break;
			case 2: 
				System.out.println("00" + n);
				break;
			case 3: 
				System.out.println("0" + n);
				break;
			case 4: 
				System.out.println(n);
				break;
			
		}
		
	
		
	}
}
