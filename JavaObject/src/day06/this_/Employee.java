package day06.this_;

public class Employee extends Person {

	String department; // 부서

	// 생성자
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	String info() { // 오버라이딩
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
}
