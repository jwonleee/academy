package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		// toString
		String a = p1.toString();
		System.out.println(a); // 아래와 결과 같음
		
		System.out.println(p1.toString()); //반환ok
	
		// equals()
		Person p2 = new Person("홍길동");
		
		System.out.println(p1.equals(p2)); // 똑같습니까? false
	
		// clone() - 객체복사
		try {
			Object obj = p1.clone();
			Person p3 = (Person)obj;
			
			System.out.println("복사된 객체의 name: " + p3.getName());
			System.out.println(p3 == p1); // false, 주소는 다르고 완전히 동일한 객체 생성
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
