package _api.util.set;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTest_Lotto {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하지 위한 인스턴스 생성
		Random r = new Random();
		//ArrayList 활용
		ArrayList<Integer> al = new ArrayList<>();
		//ArrayList의 size가 6보다 작을 때까지
		while(al.size() < 6) {
			//1~45 까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			//중복 검사를 해서 통과하면 add 하고 통과하지 못하면 add 수행하지 않음
			if(al.contains(su)) {
				continue; //포함되어 있으면 add하지 않음
			}
			al.add(su);
		}
		//출력하기 전에 정렬
		al.sort(null);
		
		System.out.println(al);
	}
}
