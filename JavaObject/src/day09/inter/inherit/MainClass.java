package day09.inter.inherit;

public class MainClass {

	public static void main(String[] args) {

//		똑같음
//		MyClass me = new MyClass();
//		Inter03 me = new MyClass();
//		me.some1();
//		me.some5();
		
//		inter02의 기능만 사용할 수 있다 (오버라이드 된 메서드 실행)
		Inter02 m2 = new MyClass();
		m2.some3();
		m2.some4();
		
//		inter01의 기능만 사용할 수 있다
		Inter01 m1 = new MyClass();
		m1.some1();
		m1.some2();
		
	}
}
