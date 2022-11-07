package day07.encap.obj;

public class Hotel { // 사용자 클래스

	public String str = new String("dd");
	private Chef chef; // = new Chef(); 멤버변수 직접 저장
	
	// 기본 생성자
	public Hotel() {
	}
	
	// 생성자 - 클래스는 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	// getter, setter 메서드
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
}
