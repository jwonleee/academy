package _api.util.arrays;

import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		
		//seed를 사용하지 않는 경우와 사용하는 경우의 차이
		//여러번 실행해보고 확인
		//java에서는 seed를 설정하지 않으면 seed가 랜덤
		
		Random r = new Random();
		System.out.println(r.nextInt());
		
		//seed를 설정하면 고정된 패턴이 숫자가 리턴
		r = new Random(42);
		System.out.println(r.nextInt()); // -1170105035
		
		//
		r = new Random();
		//윷놀이
		int[] arr = {-1, 1, 2, 3, 4, 5};
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[r.nextInt(arr.length)]);
		}
		
		//메뉴
		String[] menu = {"한식", "중식", "일식", "양식", "분식", "아시안식", "뷔페식"};
		for(int i = 0; i < 5; i++) {
			System.out.println(menu[r.nextInt(menu.length)]);
		}
		
		//주사위 게임
		for(int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(6) + 1);
		}
		
		//랜덤한 문자열 추출
		System.out.println(UUID.randomUUID().toString());
	}
}
