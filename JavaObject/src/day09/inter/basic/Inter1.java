package day09.inter.basic;

public interface Inter1 {

//	인터페이스는 객체생성이 불가합니다.
//	상수, 추상메서드 +@ (default메섣, static메서드)
	
	double PI = 3.14; // 인터페이스에 변수를 선언 → public 상수로 선언됩니다.
	void method01(); // 인터페이스에 메스드를 선언 → public 추상메서드가 됩니다.
}
