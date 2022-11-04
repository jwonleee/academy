package quiz11;

public class Computer { // 사용자 클래스
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
		private KeyBoard keyboard; 
		private Mouse mouse;
		private Monitor monitor;
		
	//1&2 직접저장 가능
	//	private KeyBoard keyboard = new KeyBoard(); 
		
	//2.기본생성자를 생성하고, 변수를 객체로 초기화 하세요!! = 생성자에서 초기화 해줌
		public Computer() {
			keyboard = new KeyBoard(); // 이렇게 초기값이 없으면 null값임, null.info()
			mouse = new Mouse();
			monitor = new Monitor();
		}

	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
		public Computer(KeyBoard keyboard) {
			this.keyboard = keyboard;
		}
		public Computer(Mouse mouse) {
			this.mouse = mouse;
		}
		public Computer(Monitor monitor) {
			this.monitor = monitor;
		}
		
	// 혹은 한줄로
	// public Computer(KeyBoard keyboard, Mouse mouse, Monitor monitor) {
	//	this.keyboard = keyboard;
	//	his.mouse = mouse;
	//	this.monitor = monitor;
	//	}

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
		public void computorInfo() {
			keyboard.info();
			mouse.info();
			monitor.info();
		}
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
		public KeyBoard getKeyboard() {
			return keyboard;
		}
		public void setKeyboard(KeyBoard keyboard) {
			this.keyboard = keyboard;
		}
		
		public Mouse getMouse() {
			return mouse;
		}
		public void setMouse(Mouse mouse) {
			this.mouse = mouse;
		}
		
		public Monitor getMonitor() {
			return monitor;
		}
		public void setMonitor(Monitor monitor) {
			this.monitor = monitor;
		}
	
}
