package day07.encap.good;
public class MainClass {

	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		me.setYear(2000); // set 저장
		int year = me.getYear(); // get 얻음
		System.out.println("년도: " + year); // 출력
		
		me.setMonth(12); // set
		int month = me.getMonth(); // get
		System.out.println("월: " + month);
		
		me.setDay(31); // set
		int day = me.getDay(); // get
		System.out.println("일: " + day);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		me.setSsn("123456-7891234");
		String ssn = me.getSsn();
		System.out.println("주민번호: " + ssn);
		
	}
	
}
