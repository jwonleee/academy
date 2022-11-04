package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
		
		// Computer 클래스 사용
		Computer com = new Computer();
		
//		com.setMonitor(new Monitor()); 이거 안해도 됨.왜..?
		
		Monitor m = com.getMonitor();
		m.info(); // Monitor 클래스의 info()불러옴
		
		com.computorInfo(); // 컴퓨터 안의 객체들의 정보들 전부 불러옴
	}
}
