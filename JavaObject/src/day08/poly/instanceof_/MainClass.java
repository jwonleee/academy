package day08.poly.instanceof_;

public class MainClass {

	public static void main(String[] args) {
		
//		instanceof - 객체의 모형을 확인
//		참고로 알아두기 / 보통은 바로 잘라버림
		
		Person s = new Student("홍길동", 10, "1234");		
		Person t = new Teacher("이순신", 20, "프로그램");		
	
		casting(s);
		casting(t);
	}
	
	public static void casting(Person p) {
		
		if(p instanceof Student) { // p가 Student라면 true, 아니면 false
			Student s = (Student)p;
			System.out.println( s.info() );
		
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println( t.info() );
		}
	}
}
