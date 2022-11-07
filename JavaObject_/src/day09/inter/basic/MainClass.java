package day09.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
//		인터페이스는 객체생성이 불가합니다.
//		Inter1 i1 = new Inter1();
		
//		인터페이스도 부모타입이 될 수 있습니다.
//		Inter1의 기능만 사용하고, override된 메서드만 실행
//		Inter1 b = new Basic();
//		b.method01();
//		b.method02(); 실행 안됨

		///////////////////////////////////////////////////
//		인터페이스도 타입이 되는게 가능. Inter1, Inter2등 그것들만 사용됨
		Basic b = new Basic(); // 다중상속, 다형성 개념
		b.method01();
		b.method02();
		
		///////////////////////////////////////////////////
		Inter2 i2 = b; // 클래스 형변환(b를 Inter2타입으로 형변환 함)
		i2.method02();
		Basic bb = (Basic)b; // (b를 다시 내 타입인 Basic타입으로 변환 가능)
		
		
		
	}
}
