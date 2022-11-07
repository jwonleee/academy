package _api.io.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜는 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\지원\\" + sdf.format(date) + ".txt", true);
			//아무것도 안 쓰면 덮어쓰고, true를 쓰면 이어서 씀
			//절대 경로: 지원뒤에 \\역슬래쉬가 있어야 그 안에 파일을 만든다는 이야기가 됨
			//경로가 잘못되면 파일 기록 실패
			//C:\Users\ user\Desktop\이지원\2022-10-27.txt (지정된 경로를 찾을 수 없습니다) 리턴
			
			//기록할 메세지 생성
			String msg = "파일에 덮어쓰기\n";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			//파일을 닫기		
			fos.close();
					
		}catch(Exception e) {
			System.out.println("파일 기록 실패");
			System.out.println(e.getLocalizedMessage());
		}
		
		
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\지원\\2022-10-27.txt");
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			//읽기 - 어디에 덮어쓸지 저장을 해야함
			fis.read(b);
			//읽은 내용 확인 - 문자로 바꿔줌
			System.out.println(new String(b));
//			System.out.println(Arrays.toString(b)); //숫자로 보고 싶을 때
			
			fis.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
