package quiz02;

public class Person {

	/*
	 * Person 클래스 를 파일로 정의
	 * 
	 * 멤버변수는 int age, String name
	 * 메서드 info() : String - 회원정보를 문자열로 더해서 ★반환!!! 출력X
	 * 
	 * 메인에서는 Person 객체를 2개 생성해서 각각 확인
	 */
	
	int age;
	String name;
	
	// 프로그래머가 생성자를 인위적으로 생성하면, 기본생성자를 안 만들어 줌.
	// name, age를 매개변수로 받는 생성자(초기화)
	Person() { // 기본 생성자
	}
	
	Person(String pName, int pAge) { // 인위적으로 생성한 생성자
		name = pName;
		age = pAge;
	}
	
	String info() {
		String result = "이름: " + name + "\n" + "나이: " + age;
		return result;
		
	}
}
