package _api.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializableMain { //e-mail에 사용가능

	public static void main(String[] args) {
		try {
			//인스턴스 단위로 파일에 기록할 수 있는 객체를 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializable.txt"));
			
			//기록할 인스턴스 생성
			SingerDTO dto = new SingerDTO(1, "부승관", new Date(98,1-1,16));
			
			//기록
			oos.writeObject(dto);
			
			oos.close();
			
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		// {}가 하나의 stack, 블럭을 만드니까 dto 인스턴스는 이름이 같아도 상관없음
		
		try {
			//인스턴스 단위로 파일에 읽어낼 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializable.txt"));
			
			//하나의 데이터 읽어오기
			SingerDTO dto = (SingerDTO)ois.readObject(); //Object로 들어오니 형변환 해야함
			System.out.println(dto);
			ois.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
