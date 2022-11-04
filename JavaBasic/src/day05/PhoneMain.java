package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
//		객체1
		Phone red = new Phone();
		red.info();
		
//		객체2
		Phone blue = new Phone("가로본능");
		blue.info();
		
//		객체3
		Phone black = new Phone("세로본능", 3000);
		black.info();
		
//		객체3-2
		Phone white = new Phone(4000, "큐리텔");
		white.info();
		
//		모든 멤버변수를 매개변수로  받는 생성자를 만들고
//		초록, 100000, 아이폰 을 전달해서 객체 생성
		Phone green = new Phone("아이폰", 10000, "초록");
		green.info();
		
	}
}
