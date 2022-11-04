package _api.util.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		//HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//Map에 데이터 저장 - put
		map.put("num", 1);
		map.put("name", "이승협");
		map.put("job", "Singer");
		//동일한 Key에 데이터를 저장하면 이전 데이터가 삭제되고 수정됨, key가 set으로 되어 있음
		map.put("job", "Singer & SongWriter");
		
		//전체 데이터 확인
		System.out.println(map);

		//Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		//존재하지 않는 Key를 사용하면 자바는 null을 리턴 !!!! 중요 꼭 기억 !!!!
		System.out.println(map.get("age"));
		
		//Map의 데이터 삭제 - remove
		map.remove("num");
		System.out.println(map);
		
		//Map을 이용하면 Key의 이용을 몰라도 모든 데이터에 접근하는 것이 가능 - Map의 최대 장점
		
		
		//모든 Key에 접근할 수 있는 Set을 가져오기
		Set<String> keys = map.keySet();
		//Set을 순회
		for(String key : keys) {
			//Key를 순회하면서 key에 저장된 value를 확인
			System.out.println(key + ": " + map.get(key));
		}
	}
}
