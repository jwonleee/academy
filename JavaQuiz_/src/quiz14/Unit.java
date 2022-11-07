package quiz14;

public abstract class Unit { // 부모클래스

	public int x; // 기본값 = 0
	public int y;
	public int hp;
	
	public Unit() {}
	public Unit(int hp) { // 생성자(각각 다름)
		this.hp = hp;
	}
	
	public abstract void location(); // 추상메서드
	public abstract void move(int x, int y);
	public abstract void stop();
	
}