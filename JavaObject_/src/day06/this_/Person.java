package day06.this_;

public class Person { // 부모클래스로 사용

	String name;
	int age;
	
	Person() {
//		this.name = "홍순자".toUpperCase;
//		this.age = 1; // 나의 멤버변수. 메서드
		this("홍길동", 1); // 두개찌리 생성자 호출
	}
	
	Person(String name) { // 두개찌리 생성자 호출
		this(name,1); // 나의 생성자
	}
	
	Person(String name, int age) {
		super();
		this.name = name.toUpperCase();
		this.age = age;
//		System.out.println("100줄짜리 코드....");
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
