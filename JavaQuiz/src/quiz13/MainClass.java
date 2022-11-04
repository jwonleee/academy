package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape s = new Circle("동그라미", 10);
		System.out.println(s.getName()); // 상속
		System.out.println(s.getArea()); // 오버라이딩
		
		Shape s1 = new Rect("네모", 10);
		System.out.println(s1.getName());
		System.out.println(s1.getArea());
		
	}
}
