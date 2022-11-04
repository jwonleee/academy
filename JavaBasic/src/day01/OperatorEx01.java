package day01;

public class OperatorEx01 {

	public static void main(String[] args) {
		
//		단형 연산자
		int i = -3;
		int j = -i;
		
		System.out.println(j); // 3
		
//		++, -- (보통 이런식으로 단행으로 따로 씀, 아래처럼 잘 안 씀)
		int k = 1;
		k++;
		System.out.println(k); // 2
		k--;
		System.out.println(k); // 1
		
//		증감연산자는 a++, ++a 의미가 조금 다름.
		k = 1;
		int h = k++; // 먼저 대입, 이후에 증가
		
		System.out.println("k값: " + k);
		System.out.println("h값: " + h);
		
		k = 1;
		int g = ++k; // 먼저 증가, 이후에 대입
		
		System.out.println("k값: " + k);
		System.out.println("g값: " + g);
		
		k = 1;
		System.out.println(k++); // k=1 (-> k=2)
		System.out.println(++k); // k=3
		
		System.out.println("---------------------------------");
//		~ 연산자 - 2진수 값을 반대로
		byte b = 10; // 0000 1010
		System.out.println(~b); //1111 0101
		System.out.println(~b + 1); //-10
		
		System.out.println("---------------------------------");
		System.out.println(!true); // false
		boolean bool = !false;
		System.out.println(bool); // true
		
	}
	
}
