package day05;

public class TvMain {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////
		//멤버변수, 메서드, 생성자를 사용해서
		//현실에서 찾아볼 수 있는 물건 생각해서 표현.
		//생성해서 사용
		
		
		Tv homeTv = new Tv("삼성 OLED", "black", 75);
		homeTv.info();
		
		homeTv.info2(999, 90);
		
		String result = homeTv.info3(0);
		System.out.println(result);
		
	}
}
