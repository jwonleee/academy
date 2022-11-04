package day08.poly.instanceof_;

public class Person { // 부모클래스로 사용

	String name;
	int age;
	
//	기본 생성자 없앴을 때
//	Person() {
//		this("홍길동", 1); // 두개찌리 생성자 호출
//	}
	
	Person(String name) { // 두개찌리 생성자 호출
		this(name,1); // 나의 생성자
	}
	
	Person(String name, int age) {
		super(); // 생략되어 있음
		this.name = name.toUpperCase();
		this.age = age;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
