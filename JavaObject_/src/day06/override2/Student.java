package day06.override2;

public class Student extends Person {

	String studentId; // 학번
	
	String info() { //오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
}
