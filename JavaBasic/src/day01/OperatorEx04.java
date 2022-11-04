package day01;

public class OperatorEx04 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3; // a = a + 3
//		b =+ 3; // b = +3 (반대로 적으면 안됨. 주의)
		System.out.println(a); // 9
		
		a -= 4; // 5
		a *= 10; // 50
		a /= 3; // 16
		a %= 4; // 0
		
		System.out.println(a); // a = 0
		
	}
}
