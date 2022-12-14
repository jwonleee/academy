package _api.util.arrays;

public class PersonVO implements Comparable<PersonVO>{ // generic

	private int num;
	private String name;
	private int age; 
	
	// 매개변수가 없는 생성자 - Default Constructor 필수
	public PersonVO() {
		super();
	}
	
	// 속성을 전부 매개변수로 받는 생성자 - 인스턴스 생성 후 값을 빠르게 대입하기 위해서 생성
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	// getter & setter - 속성의 값에 접근하고 변경하기 위한 메서드
	// 일반적으로 VO 클래스의 경우는 setter를 만들지 않음
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 데이터 출력을 편리하게 하기 위한 메서드
	// 출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출되서 출력됨
	@Override
	public String toString() { // 3번 부를것 없이 toString()만 부르면 한꺼번에 나옴
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	// 크기 비교하는 메서드: 정렬하기 위해서 사용
//	@Override
//	public int compareTo(PersonVO o) { // 오름차순
//		// 나이 비교 방법 설정
//		return this.age - o.age; // 음수를 리턴하면 자리를 바꿈, 양수가 리턴=앞이 큼, 음수가 리턴=뒤가 큼, 0=같음
//	}
	
//	@Override
//	public int compareTo(PersonVO o) { // 내림차순
//		// 나이 비교 방법 설정
//		return o.age - this.age; // 부호를 바꿔주면 됨, 이렇게 하던지 혹은 위의 메서드에서 *-1을 해주던지
//	}
	

//	@Override
//	public int compareTo(PersonVO o) { // 오름차순
//		// 문자열 비교 방법 설정
//		return this.name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(PersonVO o) { // 내림차순
		// 문자열 비교 방법 설정
		return o.name.compareTo(this.name);
	}
	
	
}
