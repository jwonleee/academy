package day06.super_;

public class Student extends Person {

	String studentId; // 학번
	
	// 생성자
	Student(String name, int age, String studentId) {
		super(name, age);
//		super();
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}
	
	String info() { //오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
