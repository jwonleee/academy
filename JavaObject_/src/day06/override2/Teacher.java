package day06.override2;

public class Teacher extends Person {

	String subject; // 과목
	
	String info() { // 오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
