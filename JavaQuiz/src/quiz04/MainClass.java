package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior war = new Warrior("곽두식");
		war.info();
		war.bash();
		war.bash();
//		int b = war.bash();
//		System.out.println("mp:" + b); 이렇게 하면 출력은 mp만.
//		int b1 = war.bash();
//		System.out.println("mp:" + b1);
//		연속적으로 하려면 변수명b,b1 달라야 함. b는 임의로 정한거니까!
		
		
		Wizard wiz = new Wizard("온마리");
		wiz.info();
		wiz.iceArrow();
		wiz.iceArrow();
		
		
		
		
		
	}
	
}
