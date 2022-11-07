package quiz14;

public class MainClass {

	public static void main(String[] args) {
		
//		Marine m = new Marine();
//		m.move(10,20);
//		m.location();
//		System.out.println( Marine.armor);
//		System.out.println( Marine.attack); 아래와 같음
		
		
		Unit u = new Marine();
		u.location();
		u.move(10, 20);
		u.stop();
		
		Unit u1 = new tank();
		tank t = new tank();
		u1.location();
		u1.move(10, 30);
		u1.stop();
		t.changeMode();

		Unit u2 = new DropShip();
		u2.location();
		u2.move(10, 40);
		u2.stop();
		
	}
}
