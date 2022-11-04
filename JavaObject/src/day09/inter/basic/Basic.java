package day09.inter.basic;

//	인터페잉스는 implements 키워드로 상속을 받습니다.
public class Basic /*extends Object*/ implements Inter1, Inter2 {

	public void method01() {
		System.out.println("오버라이딩 된 Inter1메서드");
	}
	
	public void method02() {
		System.out.println("오버라이딩 된 Inter2메서드");
	}
}
