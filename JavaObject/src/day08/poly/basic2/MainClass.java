package day08.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "12313");
		Teacher t = new Teacher("홍길자", 30, "프로그램");
		Employee e = new Employee("홍길순", 40, "취업지원팀");
		
//		Object[] arr = {s, t, e};
		Person[] arr = {s, t, e};
		
		for( Person p : arr) {
			System.out.println(p.info()); // 오버라이딩 된 메서드
		}
		
//		MainClass c = new MainClass();
//		c.printInfo(e); 이렇게 쓸수도 있음
		
		printInfo(s);
		printInfo(t);
		printInfo(e);
		
		
//		House 객체 생성
		House house = new House();
		house.setPerson(s); // 스튜던트 저장
		house.setPerson(t); // 티쳐 저장
		house.setPerson(e); // 임플로이 저장

		Person[] ar = house.getArr();
		System.out.println(Arrays.toString(ar));
		
//		for( Person p : ar) { 들어가 있는 값 확인하려면 반복 돌려야 함
//			if(p == null) break;
//			System.out.println(p.info()); // 오버라이딩 된 메서드
//		}
	}
	
	
	public static void printInfo(Person p) { // 부모타입 매개변수	
		System.out.println(p.info());
	} // 여기는 메서드
	
	
}