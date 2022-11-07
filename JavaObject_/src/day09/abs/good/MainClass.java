package day09.abs.good;

public class MainClass {

	public static void main(String[] args) {
		
//		1. 추상클래스는 객체 생성이 안됩니다.
//		   반드시 자식으로 구체화합니다.
		
//		Store s = new SeoulStore(); // 자식으로 생성해서 추상클래스 타입에 저장해도 결과는 똑같음
		Store s = new BusanStore(); // new SeoulStore(); 위의 내용이 다형성임
		s.apple();
		s.melon();
		s.orange();
		
		System.out.println(s.getName()); // 상속받은
	}
}
