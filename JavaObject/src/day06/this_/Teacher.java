package day06.this_;

public class Teacher extends Person {

	String subject; // 과목
	
	// 생성자
	Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	
	
	
	String info() { // 오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
