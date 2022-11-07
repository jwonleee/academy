package quiz10;
import java.util.Arrays;

public class User { // 값을 저장하고 사용할 클래스

	private String name;
	private int age;
	private int rrn;
	
//	기본 생성자
	public User() {
	}
	
//	모든 멤버변수를  초기화 하는 생성자
	public User(String name, int age, int rrn) {
		super();
		this.name = name;
		this.age = age;
		this.rrn = rrn;
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

	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	
	
}