package atcoder;

import java.util.Scanner;

public class QuizA_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요> ");
		String row = scan.nextLine();
		int a = Integer.parseInt(row);
		
		QuizA_12 math = new QuizA_12();
		int ft = math.function(a);
		int fft = math.function(ft);
		
		int fftt = math.function(ft + a); // 헷갈림
		
		int result = math.function(fftt + fft);
		
		System.out.println(result);
		
		
	} // main의 끝


//	public static class MyMath{
		public static int function(int a) {
			int t = (a*a) + (2*a) + 3;
			return t;	
		}
//	}

}