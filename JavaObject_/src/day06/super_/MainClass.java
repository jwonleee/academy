package day06.super_;

public class MainClass {

	public static void main(String[] args) {
		
		Mother m = new Mother();
		System.out.println(m.info());
	
		Employee e = new Employee("이순신", 20, "인사");
		System.out.println(e.info());
		
		Student s = new Student("둘리", 6, "12345");
		System.out.println(s.info());
		
		Teacher t = new Teacher("고길동", 50, "역사");
		System.out.println(t.info());
		
		
	}
}
