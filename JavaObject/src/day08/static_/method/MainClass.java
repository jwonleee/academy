package day08.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.some1(); // 일반 메서드 b = 1
		c.some2(); // 정적 메서드 b = 2
		
		// 정적 메서드 - 객체생성 없이 사용
		Count.some2(); // b = 3
		
//		main은 static이기 때문에 
		MainClass.a();
		a();
		
//		static 사용방법
		Math.random();
		Integer.parseInt("3");
		Arrays.toString(new int[3]);
	}
	
	public static void a() {
		
	}
}
