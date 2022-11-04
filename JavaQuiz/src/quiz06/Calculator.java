package quiz06;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	Calculator() {
		
	}
	
//	Calculator(int r, double p) { 이거 없어도 됨
//		result = r;
//		pi = p;
//	}
	
	int add(int a) {
		result += a;
		System.out.println("최종 누적 값: " + result);
		return result;
	}
	
	double circle(int r) {
		double rect = 0;
		rect = pi * r * r;
		System.out.println("원의 넓이: " + rect);
		return rect;
		
//		return r * r * pi; 단 한줄로 가능...
	}
	
}
