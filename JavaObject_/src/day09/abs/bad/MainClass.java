package day09.abs.bad;

public class MainClass {

	public static void main(String[] args) {
		
		SeoulStore s = new SeoulStore();
		s.apple(); // 서울의 사과는 500원
		s.melon(); // 서울의 멜론은 600원
		s.orange(); // 오버라이딩을 반드시 해야하는데, 하지 않았다면 잘못된 메서드가 실행될 수 있습니다.
		
				
	}
}
