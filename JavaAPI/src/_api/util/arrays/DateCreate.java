package _api.util.arrays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		// 현재 시간을 갖는 Date 인스턴스 생성
		Date currentTime = new Date();
//		
//		// 출력
//		System.out.println(currentTime);
//	
//		// 원하는 날짜를 가지고 생성: 1995년 1월 1일 16:08:00 으로 설정
//		// 원하는 년도 - 1900, 원하는 월은 하나 밀려서 -1을 해야 함
//		Date firstMeetingTime = new Date(1995-1900, 1-1, 1, 16, 8, 0);
//		
//		// 출력 - 년월일 시분초 출력
//		System.out.println(firstMeetingTime);
//		
//		// 년도 만 추출해서 출력, 웬만하면 쓰지 마라
//		System.out.println(firstMeetingTime.getYear() + 1900);
//		
//		// 원하는 포맷으로 출력
//		// 1995년 1월 1일 ?요일이라고 출력
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
//		System.out.println(sdf.format(firstMeetingTime));
	
		// 연습할 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력
		
		System.out.println(currentTime);
		
		
	}
}
