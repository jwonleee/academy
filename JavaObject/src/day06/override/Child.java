package day06.override;

public class Child extends Parent {

	// 오버리이딩 된 메서드
	// int method02() { } 여기만 같으면 됨. return, 안의 내용물은 달라도 됨.
	int method02() {
		System.out.println("자식의 오버라이딩 된 2번 메서드");
		return 100;
	}
	
	// 자신의 메서드
	void method03() {
		System.out.println("자식의 3번 메서드");
	}
	
}
