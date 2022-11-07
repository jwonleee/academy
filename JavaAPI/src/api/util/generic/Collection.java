package api.util.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
	
		list.add(1);
		list.addAll(list2);
		
		System.out.println(list);
		int b = list.get(0); //1
		System.out.println(b);
		int s = list.size(); //4
		System.out.println(s);
		
		list.forEach( x -> { //람다식
			System.out.println(x); //1 1 2 3
		});
		
		for(int y : list) { //list를 돌리는데 list의 타입값을 넣어줌
			System.out.println(y); //위의 람다식과 같은 결과값
		}
		
		//////////////////////// Map /////////////////////////
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		
		map.put(3, "abcd"); //값은 고유하니까 수정됨
		System.out.println(map.toString());
		
		String result = map.get(1); //KEY사용
		System.out.println(result);
		
		
		//맵의 반복
		Set<Entry<Integer, String>> ens = map.entrySet(); //map을 Set이라는 모형으로 바꿔주는 것
		for(Entry<Integer, String> e : ens) { //ens를 돌리는데 그 타입의 변수를 넣어줌
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
	}
}
