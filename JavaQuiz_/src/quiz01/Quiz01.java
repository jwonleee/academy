package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); // y=15 - 15-2뺀 값이 13/ x에 1을 더함 x=3
		System.out.println(x+=2); // x=5
		System.out.println( !('A' <= c && c <='Z') ); // !(T&&T) = false
		System.out.println('C'-c); // 67-65 =2 이항 연산이 일어나면 int형 따라감
		System.out.println(c+1); // 66 이항 연산 일어나면 int형 따라감
		System.out.println(++c); // 67 - B 이항 연산이 아니고 단순히 문자형c 값을 증가해주는 상태기 때문에 문자 나옴
		System.out.println(c++); // 68 - B
		System.out.println(c);  // 69 - C
		
	}
}
