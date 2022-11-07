package _api.io.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//파일에 문자 단위로 기록하고 읽어오기
public class CharacterFileMain {

	public static void main(String[] args) {
		//파일에 문자열을 문자 단위로 기록하기: FileWriter 와 PrintWriter 이용
		try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 인스턴스를 생성
			//한 번 기록하고 두번째 기록할 때 이어서 기록하는 인스턴스
			//true를 생략하고 false를 설정하면 파일의 내용을 항상 새로 작성합니다.
			PrintWriter pw = new PrintWriter(new FileWriter("ch.txt", true));
			
			//문자열을 기록
			//문자열을 기록할 때 , 나 공백 및 탭 등으로 구분이 가능한데 이렇게 만들어진 텍스트를 csv 라고 합니다.
			//이 방식은 변하지 않는 고정적인 데이터를 기록할 때 주로 이용
			pw.print("naver,한국\n");
			pw.print("kakao,한국\n");
			pw.print("google,미국\n");
			//버퍼의 내용 전부 출력
			pw.flush();
			
			//닫기
			pw.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		};
		
		//파일에 문자열을 문자 단위로 읽어오기: FileReader 와 BufferedReader 이용
		//줄 단위로 읽어오기
		try {
			//문서 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
			BufferedReader br = new BufferedReader(new FileReader("./ch.txt"));
			
			//줄 단위로 읽어서 출력하기
			while(true) {
				//한 줄 읽기
				String line = br.readLine();
				//읽은 데이터 없으면 종료
				if(line == null) {
					break;
				}
				//읽은 데이터 출력
				//System.out.println(line);
				
				//읽은 문자열에서 , 를 기준으로 앞의 데이터만 출력
				String[] arr = line.split(",");
				System.out.println(arr[0]);

				//읽은 문자열에서 , 를 기준으로 뒤의 데이터만 출력
				String[] arr2 = line.split(",");
				System.out.println(arr2[arr2.length-1]);
			}
			
			br.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
