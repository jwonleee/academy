package day06.this_;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person(); // 부모님
		System.out.println( p.info() );
		// 반환이 있는 메서드라 출력문 안에
		
		//
		Person p1 = new Person("honggilja");
		System.out.println( p1.info() );
		
		//
		Person p2 = new Person("honggildong", 20);
		System.out.println( p2.info() );
		
		//
		Teacher t = new Teacher("이순신", 20, "프로그램");
		System.out.println( t.info() );
		
	}
}
