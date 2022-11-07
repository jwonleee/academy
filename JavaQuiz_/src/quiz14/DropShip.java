package quiz14;

public class DropShip extends Unit {
	
	
	public DropShip() { // 안에 int hp 생략가능
		super(150);
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
