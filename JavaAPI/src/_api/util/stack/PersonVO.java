package _api.util.stack;

import java.util.Date;

//여러 개의 값을 묶어서 표현하지 위한 클래스 - Value Object(VO)
//getter 와 constructor는 만들지만 setter는 만들지 않는 경우가 많음
//서버나 누군가가 제공해 주는 데이터를 읽을 목적으로 사용하기 때문

public class PersonVO {
	//번호, 이름, 생일, 전화번호, 이메일을 저장
	private long num;
	private String name;
	private Date birthday;
	private String phone;
	private String email;
	
	//매개변수가 없는 생성자 - default constructor
	//NoArgsConstructo
	public PersonVO() {
		super();
	}

	//매개변수가 전부 있는 생정자는 데이터를 가져올 때, 따로따로 하면 5번이나 불러야 함
	//AllArgsConstructor
	public PersonVO(long num, String name, Date birthday, String phone, String email) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
	}

	public long getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	//값을 빠르게 확인하기 위한 메서드
	//디버깅을 위한 메서드 - 개발 과정 중 값을 확인하기 위한 목적 == 개발이 끝나면 불필요한 메서드
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
}
