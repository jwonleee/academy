package day08.poly.basic;

public class Child extends Parent { // Child 1,2,3번 사용 가능

//	alt + shift + s → override/Implement Methods

	public void method02() {
		System.out.println("오버라이드 된 2번 메서드");
		// super.method02(); super.를 통한 부모님의 메서드 호출
	}
	
	public void method03() {
		System.out.println("자식의 3번 메서드");
	}

	
}
