package day07.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		// 변수를 public으로 만들어두면, 잘못된 값이 저장될 수 있습니다.
		
		MyBirth mm = new MyBirth();
		mm.year = 2023;
		mm.month = 13;
		mm.day = 32;
		mm.ssn = "아무값";
		
		mm.info();
	}
}
