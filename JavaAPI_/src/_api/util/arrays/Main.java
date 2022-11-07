package _api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 동적 - 바꿀수 있음
		// 배열생성
		PersonVO[] persons = {new PersonVO(1, "수지", 29),
							  new PersonVO(2, "아이유", 30),
							  new PersonVO(3, "카리나", 23),
							  new PersonVO(4, "아담", 46),
		};
		
		// Arrays.sort() 메서드는 배열을 대입하면 부등호 또는 compareTo 라는 메서드를 호출해서
		// 크기 비교를 한 후 정렬을 수행해 줌
		// Arrays.sort(persons); // 실행하면 예외발생 - PersonVO에는 크기 비교를 할 수있는 메서드가 존재하지 X
		// PersonVO 클래스에 크기 비교하는 메서드(Comparable)를 만들어서 비교
		
// 		동적으로 크기 비교하는 메서드를 설정
//		Arrays.sort(persons, new Comparator<PersonVO>(){
//
//			@Override
//			public int compare(PersonVO o1, PersonVO o2) {
//				// return o1.getAge() - o2.getAge(); // 오름차순
//				return o2.getAge() - o1.getAge(); // 내림차순
//			}
//			
//		});
		
		// 동적으로 정렬하기
		// 1.이름의 오름차순 2.이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순
		Scanner scan = new Scanner(System.in);
		System.out.println("1.이름의 오름차순 2.이름의 내림차순 3.나이의 오름차순 4.나이의 내림차순");
		String menu = scan.nextLine();

		switch (menu.trim()) {
		case "1":
			Arrays.sort(persons, new Comparator<PersonVO>(){
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getName().compareTo(o2.getName());
				}
			});
			break;

		case "2":
			Arrays.sort(persons, new Comparator<PersonVO>(){
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getName().compareTo(o1.getName());
				}
			});
			break;

		case "3":
			Arrays.sort(persons, new Comparator<PersonVO>(){
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o1.getAge() - o2.getAge();
				}
			});
			break;

		case "4":
			Arrays.sort(persons, new Comparator<PersonVO>(){
				@Override
				public int compare(PersonVO o1, PersonVO o2) {
					return o2.getAge() - o1.getAge();
				}
			});
			break;

		default:
			System.out.println("메뉴는 1-4번 중에서 선택하세요");
			break;
		}

		scan.close();


		// 배열의 데이터 출력
		// Arrays.toString()은 배열의 각 요소의 toString을 전부 호출해서
		// 하나의 문자열로 리턴하는 메서드
		System.out.println(Arrays.toString(persons));

		// 실제 해시코드 (해시코드는 운영체제가 결정함, ==는 해시코드를 비교하는 것)
		// System.out.println(System.identityHashCode(persons));

	}
}
