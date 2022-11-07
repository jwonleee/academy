package _api.util.stream.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousMain3 {

	public static void main(String[] args) {
		
		//배열의 정렬
		String[] arr = {"SM", "JYP", "스타쉽", "YG", "나무엑터스"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체);
		//를 호출해야 함
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//이 내부에는 공부를 해야 쓸 수 있음
				//지금은 여기까지 틀을 만들어내는 게 중요
				return o2.compareTo(o1); //내림차순, java.lang.String의 compareTo 메서드 사용
			}
		});
		
		//배열의 요소를 빠르게 확인
		System.out.println(Arrays.toString(arr));
		
		//하나씩 확인
		for(String app : arr) {
			System.out.println(app);
		}
		
	}
}
