package quiz14;

public class Marine extends Unit {
	
	public static int attack = 6; // 객체마다 같은 값을 갖도록 static
	public static int armor =0; // static멤버 가져올 때 클래스명.이름
	
	public Marine() { // hp 생성자 부모한테 상속받아서 super()로 빌려쓰기
		super(40);
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
		
}
