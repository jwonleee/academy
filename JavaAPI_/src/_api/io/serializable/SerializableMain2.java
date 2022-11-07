package _api.io.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
public class SerializableMain2 { //e-mail에 사용가능

	public static void main(String[] args) {
		/*
		 * try() 안에서 클래스가 AutoCloseable을 implements 하고 있으면, 검색이 끝날 때 자동으로 close()를 호출
		 */
		try (//인스턴스 단위로 파일에 기록할 수 있는 객체를 생성
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));){
			
			//기록할 인스턴스 생성
			SingerDTO dto1 = new SingerDTO(1, "부승관", new Date(98, 1-1, 16));
			SingerDTO dto2 = new SingerDTO(2, "버논", new Date(98, 2-1, 18));
			
			//데이터는 하나로 만들기 ex)파워포인트 열 때 한번만 여는 것처럼
			//기록할 인스턴스가 여러 개 이므로 하나의 List로 묶어줍니다.
			ArrayList<SingerDTO> list = new ArrayList<>();
			list.add(dto1);
			list.add(dto2);
					
			//기록
			oos.writeObject(list);
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try (//인스턴스 단위로 파일에 읽어낼 수 있는 객체를 생성
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));){
			
			//기록을 할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 합니다.
			//만들 때 어떻게 만든지 모르면 읽는게 안 됨
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}