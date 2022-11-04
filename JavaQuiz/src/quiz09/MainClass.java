package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		
		SuperSonicAp ss = new SuperSonicAp("제주항공",0);
		ss.fly();
		ss.takeOff(); // 상속받은 메서드
		ss.land(); // 상속받은 메서드
		
//		이렇게 해도 되는데 flyMode 매개변수를 넣지 않고, 여기서 바꿔도 됨
//		ss.flyMode = 1;
//		ss.fly();
		
		System.out.println(ss.info());
		
	}
}
