package day08.static_.singleton;

public class Computer {

	public static int a = 10;
	
//	정적 초기화자 - 1회만 실행
	static {
		System.out.println("단 1번 실행 - 클래스가 호출될 때");
	}
}
