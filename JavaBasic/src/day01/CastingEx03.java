package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
//		연산에서의 형변환
		char c = 'C'; //67
		int i = 2;
		
		System.out.println(c + i);
		
//		1. 서로 다른 타입의 연산에서는 큰 타입을 따라갑니다.
		char cc = (char)(c + i);
		int ii = c + i;
		
		System.out.println(cc); //E
		System.out.println(ii); //69
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		System.out.println(result);
		
//		2. int형보다 작은 타입의 연산 결과는 int가 됩니다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2); // 소괄호도 중요, 굳이 byte로 저장하고 싶으면 casting하면 되고, 아니면 int로 저장
		
		short s1 =100;
		byte s2 = 10;
		short s3 = (short)(s1 + s2);
			
		
	}
	
		
}
