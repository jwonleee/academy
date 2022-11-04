package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); // 부모님
		p.age = 10;
		p.name = "부모님";
		System.out.println( p.info() );
		// 반환이 있는 메서드라 출력문 안에
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.print( s.info() );
		System.out.println(", 학번:" + s.studentId );
		
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "역사";
		System.out.print( t.info() );
		System.out.println(", 과목:" + t.subject );
		
		
		
	}
}
