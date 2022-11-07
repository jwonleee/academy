package quiz06;

public class Computor extends Calculator{

	// 오버라이딩	
	double circle(int r) {
		return Math.PI * r * r;
	}
	
	// 오버로딩
	double rec(double a) {
		double recResult = 0;
		recResult = a * a;
		System.out.println("정사각형의 넓이: " + recResult);
		return recResult; // return a * a; 한줄로 가능
	}
	
	double rec(double a, double b) {
		double recResult = 0;
		recResult = a * b;
		System.out.println("직사각형의 넓이: " + recResult);
		return recResult;
	}
	
	double rec(double a, double b, double c) {
		double recResult = 0;
		recResult = a * b * c;
		System.out.println("직육면체의 넓이: " + recResult);
		return recResult;
	}
}
