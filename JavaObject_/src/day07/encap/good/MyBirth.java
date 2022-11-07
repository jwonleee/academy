package day07.encap.good;
import java.util.Arrays;

public class MyBirth {
	
//	private일 경우 set, get있어야 외부에서 사용가능
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때 클래스설계자가 만들어 놓은
	 * getter / setter 메서드를 사용합니다.
	 * 
	 * 국룰 - get시작(값을 얻는다), set시작(값을 저장)
	 * 
	 * set 메서드
	 * 1. 값을 저장하는 메서드
	 * 2. public으로 선언하고 set + 멤버변수명으로 저장
	 */
	
	public void setYear(int year) {
//		유효값 검증
		if(year > 2022 || year < 1900 ) {
			System.out.println("년도는 1900~2000년도입니다.");
		} else {
			System.out.println("저장완료");
			this.year = year;
		}
	}
	
	/*
	 * getter 메서드
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고 get + 멤버변수명으로 지정
	 */
	public int getYear() {
		return year;
	}
	
	
	/*
	 * month, day, ssn에 대한 getter, setter 생성
	 * month - 1~12월까지만 저장가능
	 * day - 1~31일까지만 저장가능
	 * ssn - 하이픈을 제거하고 13자리까지만 저장가능
	 */
//	month
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) { //month < 1 || month > 12
			this.month = month;
		} else {
			System.out.println("달은 1~12월까지 입니다.");
		}
	}
	public int getMonth() {
		return month;
	}
	
//	day
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		} else {
			System.out.println("일자는 1~31일까지 입니다.");
		}
	}
	public int getDay() {
		return day;
	}
	
//	ssn
	public void setSsn(String ssn) {
		String g = ssn.replace("-", "");
		if(g.length() > 13) {
			System.out.println("주민번호는 13자리 입니다.");
		} else {
			this.ssn = ssn;
		}
	}
	public String getSsn() {
		return ssn;
	}
	
	//	char []arr = ssn.toCharArray();
	//System.out.println(Arrays.toString(arr));
	//for(int i = 0; i < 14; i++) {
	//	if("-".equals(arr[i])) {
	//		for(int j = i; j < 13; j++) {
	//			arr[j] = arr[j+1];
	//		}
	//		arr.length--;
	//	}
	//}
	//this.ssn = ssn; 어렵게 할 필요 X
	
}
