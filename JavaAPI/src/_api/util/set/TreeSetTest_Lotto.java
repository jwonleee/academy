package _api.util.set;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetTest_Lotto {

	public static void main(String[] args) {
		//랜덤한 숫자를 추출하지 위한 인스턴스 생성
				Random r = new Random();
				//TreeSet: 중복된 데이터를 저장하지 않고 저장된 순서를 기억합니다.
				TreeSet<Integer> treeSet = new TreeSet<>();
				while(treeSet.size() < 6) {
					//1~45 까지의 숫자를 랜덤하게 추출
					int su = r.nextInt(45) + 1;
					treeSet.add(su);
				}
				for(Integer i : treeSet) {
					System.out.print(i + "\t");
				}
	}
}
