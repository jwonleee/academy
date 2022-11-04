package day06.override2;

public class Employee extends Person {

	String department; // 부서

	String info() { // 오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
}
