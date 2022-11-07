package day09.final_.method;

public class Child extends Parent{

	public void method01() {}
//	public void method02() {} //오버라이딩 금지, 상속은 되서 내려오기 때문에 사용은 할 수 있음
	
	public static void main(String[] args) {
		Child c = new Child();
		c.method02();
	}
	
}
