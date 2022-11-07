package quiz09;

public class SuperSonicAp extends Airplane {

	/*
	 * 1. Airplane을 상속받습니다. 생성자는 이름을 받아서 초기화 하도록 생성하세요
	 * 2. flyMode int형 변수를 선언하세요
	 * 3. fly() 메서드를 오버라딩합니다
	 * 	  fly() 메서드 안에서는 flyMode가 1이라면 "고속 모드로 비행합니다" 출력
	 *          flyMode 0이라면, super를 통해 부모님의 메서드를 호출
	 * 4. info() 메서드는 이름을 비행기의 이름, 모드를 리턴하도록 생성하세요.
	 */

	int flyMode;
	
	SuperSonicAp(String name, int flyMode) {
		super (name); // 기본 생성자가 없으니까 생성자는 이름을 받아서 초기화 하도록 생성
		this.flyMode = flyMode;
	}
	
		
	void fly() { // 오버라이딩
		if(flyMode == 1) { // 중복되는 변수가 없어서 this 안찍어도 됨
			System.out.println("고속 모드로 비행합니다");
		} else if (flyMode == 0) {
			super.fly();
		}
	}
	
	
	String info() {
		return "이름:" + name + ", 모드:" + flyMode; // super.name, this.name 써도 됨
	}
		
		
}







