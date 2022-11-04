package _api.util.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		//샘플 데이터 삽입
		hashSet.add("Samsung");
		linkedHashSet.add("Samsung");
		treeSet.add("Samsung");
	
		hashSet.add("LG");
		linkedHashSet.add("LG");
		treeSet.add("LG");
	
		hashSet.add("Apple");
		linkedHashSet.add("Apple");
		treeSet.add("Apple");
	
		hashSet.add("motorola");
		linkedHashSet.add("motorola");
		treeSet.add("motorola");

		hashSet.add("42");
		linkedHashSet.add("42");
		treeSet.add("42");
		
		//절대로 중복저장 하지 않음
		hashSet.add("motorola");
		linkedHashSet.add("motorola");
		treeSet.add("motorola");
		
		//데이터 출력
		//HashSet - 규칙X
		for(String company : hashSet) {
			System.out.print(company + "\t\t");
		}
		System.out.println();
		//LinkedHashSet - 저장된 순서대로
		for(String company : linkedHashSet) {
			System.out.print(company + "\t\t");
		}
		System.out.println();
		//TreeSet - 정렬순서대로
		for(String company : treeSet) {
			System.out.print(company + "\t\t");
		}
		System.out.println();
	}
}
