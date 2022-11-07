package _api.util.arrays;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {

	public static void main(String[] args) {
		
		//날짜와 시간을 다른 형태로 사용하는 클래스
		Calendar calendar = new GregorianCalendar();
		
		//Date보다 많은 정보를 출력
		System.out.println(calendar); 
		
		//특정한 데이터를 조회 - 년,월,일 추출
		//1월을 0부터 시작하므로, 필요시에 월의 값에 1을 더해줘야 함
		System.out.println(calendar.get(Calendar.YEAR)); // 2022
		System.out.println(calendar.get(Calendar.MONTH)+1); // 9+1 
		System.out.println(calendar.get(Calendar.DATE)); // 25
		
		//최근에 많이 사용하는 날짜 타입
		//LocalDateTime은 월-1을 하지 않음, 그냥 월
		LocalDateTime meetingTime = LocalDateTime.of(2022, 10, 27, 18, 50);
		System.out.println(meetingTime);
	}
}
