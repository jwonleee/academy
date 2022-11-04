package quiz14;

public class tank extends Unit{
	
	private boolean mode;
	
	public tank() {
		super(100);
	}
	
		public void location() {
			System.out.println("현재 위치: " + x + ", " + y);
		}
		public void move(int x, int y) {
			this.x = x;
			this.y = y;
			System.out.println("움직인 위치: " + x + ", " + y);
		}
		public void stop() {
			System.out.println("정지");
		}
//		특별한 기능 - mode 변경 (true → false, false → true)
		public void changeMode() {
			if(mode) {
				mode = false;
			} else {
				mode = true;
			}
//			System.out.println("공격모드 변경");
		}
}
