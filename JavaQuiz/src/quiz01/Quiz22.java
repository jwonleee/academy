package quiz01;

public class Quiz22 {

	public static void main(String[] args) {
		
		method1();
		
		String result = method2("hello");
		System.out.println(result);
		
		int a = (int)method3(1);
		int b = (int)method3(2);
		double c = method3(3.5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		method3(1, 2, 3.5);
		
		String str = method4(2); // str, 여기서는 2가 매개 변수
		System.out.println(str); // 정수를 입력했는데 반환이 String이니까 이렇게 해줌
		
		method5(3, "라"); // void형이니까 단순 실행
		
		int max = maxNum(10, 6);
		System.out.println(max);
		
		abs(-5);
		
		String s = java(5);
		System.out.println(s);
		
		int n = sum(5);
		System.out.println(n);
		
	} // end main
	
	
	
//		method1 / x / x / "안녕"출력
	static void method1() {
		System.out.println("안녕");
	}
	
	
//		method2 / String / String / "전달 받은 매개 변수 리턴"
	static String method2(String s) {
		return s;
	}
	
	
//		method3 / ? / int, int, double / "세 매개 변수 리턴"
	static double method3(double a) {
		return a;
	}
	static double method3(int a, int b, double c) {
		double d = a + b + c;
		return d;
	}
	
	
//		method4 / String / int / 매개 변수가 짝수면 "짝수", 홀수면 "홀수" 리턴
	static String method4(int num) {
		String str = null; // String str; 초기값 안줘도 둘중에 무조건 하나 실행
		
		if(num % 2 == 0) {
			str = "짝수";
		} else if (num % 2 == 1) {
			str = "홀수";
		}
		return str;
	}
//	static String method4(int num) {
//		if(num % 2 == 0) {
//			return "짝수";
//		} else {
//			return "홀수";
//		}
//	}
	
	
//		method5 / x / String, int / "매개 변수 int 만큼 String 반복 출력"
	static void method5(int count, String text) {
		for(int i = 1; i <= count; i++) {
		}
		System.out.println(text);
	}
	
	
//		maxNum / ? / ? / "매개변수 2개를 입력받아 큰 수 리턴"
	static int maxNum(int c, int d) {
		int max = 0;
		if(c > d) {
			max = c;
		} else if ( c < d) {
			max = d;
		}
		return max;
	}
//	static int maxNum(int c, int d) {
//		return c > d ? c : d ;
//	}
	
	
//		abs / ? / int / "절대값 리턴"
	static int abs(int e) {
		int a = 0;
		if(e < 0) {
			return -a;
		} else {
			return a;
		}
	}
	

//		홀수 - "자", 짝수 - "바"
	static String java(int num) {
		String s = ""; // 잘 모르면 초기값 하나 만들어 놓고 그 친구에 대해서 return 건다.
		
		for(int i = 1; i <= num; i++) {
			
			if(i % 2 == 1) { // i = 1, 3, 5, 7...
				s += "자"; // s 옆에 "자"를 붙임
			} else { // i = 2, 4, 6, 8...
				s += "바"; // s 옆에 "바"를 붙임
			}
		}
		// return을 for문 안에서 쓰는 경우도 있음. 단, 여기서는 넣으면 시작하자마자 종료임.
		return s;
	}
	
	
//	자연수 n을 입력받아 n의 약수를 모두 더한 것을 리턴하는 함수를 완성하세요.
	static int sum(int n) {
		int sum = 0;
			
		for(int i = 1; i <= n; i++) {
			if( n % i == 0 ) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	
}
