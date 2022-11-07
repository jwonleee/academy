package quiz02;

public class PersonMain {

	public static void main(String[] args) {
		
		// 1. 객체 생성
		Person per = new Person(); // 생성
		
		// 2. .로 사용
		per.name = "홍길동";
		per.age = 100;
		
		// 3. 리턴이 실린 경우는 호출로 끝내면 안되고
		String a = per.info();
		System.out.println(a);
		// System.out.println(per.info());
		
		System.out.println("------------------");
		
		Person per2 = new Person(); // 생성2
		per2.name = "둘리";
		per2.age = 1000; // 호출
		System.out.println(per2.info()); // 출력
		
		System.out.println("------------------");
		
		Person per3 = new Person("또치",13);
		String b = per3.info();
		System.out.println(b);
		
	}
}
