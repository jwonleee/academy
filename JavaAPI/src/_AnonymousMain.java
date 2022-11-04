

interface Starcraft{
	public void attack();
}

//인터페이스를 구현한 클래스를 생성
class Protoss implements Starcraft{
	@Override
	public void attack() {
		System.out.println("질럿의 공격");
	}
}

public class _AnonymousMain {

	public static void main(String[] args) {
		
		//	  똑같은 거 여러번 쓸 때 유용
		// 1. 인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss p = new Protoss();
		p.attack();
		
		//	  한번만 쓸 때 유용
		// 2. 인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		//	  클래스를 안 만들면 메모리는 이득을 봄(클래스는 프로그램종료까지 지워지지 않기 때문에)
		Starcraft z = new Starcraft() { //인터페이스 이름, 변수이름 = new 인터페이스이름() {}; → 에러가 난 부분을 클릭하면 메서드가 생성, 내용 적기
			@Override
			public void attack() {
				System.out.println("저그의 공격");
			}};
		z.attack(); //호출

		// 3. 변수를 만들지 않고 인스턴스만 생성해서 메서드 호출 = Anonymous class
		new Starcraft() {
			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
		}.attack();
	}
}
