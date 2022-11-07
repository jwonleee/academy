package quiz13;

public abstract class Shape { // 부모클래스

	private String name;
	
	public Shape(String name) { // 생성자 필수
		this.name = name;
	}
	
	//오버라이딩을 강제화 한다면 추상메서드로 선언
	public abstract double getArea();
	
	//오버라이딩을 강제화 하지않는다면 일반메서드로 선언
	public String getName() {
		return "도형이름:" + name;
	}
}
