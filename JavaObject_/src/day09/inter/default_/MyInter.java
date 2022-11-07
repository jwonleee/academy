package day09.inter.default_;

public interface MyInter {

//	상수, 추상, default, static
	
	double PI = 3.14;
	void some1();

//	default 메서드 - 인터페이스에도 몸체를 가지는 메서드 선언이 가능합니다.
//	몸체가 있어서 오버라이딩 안해도 되고, 기본 메서드처럼 사용가능 = 상속이 됨
	default void some2() {
		System.out.println("default메서드 실행");
	}
	
	static void some3() {
		System.out.println("static메서드 실행");
	}
}
