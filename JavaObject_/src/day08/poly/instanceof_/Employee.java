package day08.poly.instanceof_;

public class Employee extends Person {

	String department; // 부서

	// 생성자
	Employee(String name, int age, String department) {
		
		super(name, age);
		this.department = department;
	}
	
	String info() { // 오버라이딩
		String result = super.info();
		return result + ", 부서:" + department;
		
//		super.메서드() - 부모님의 원형이 필요할 때 사용
//		return super.info() + ", 부서:" + department; 위의 두줄과 같음
	}
	
}
