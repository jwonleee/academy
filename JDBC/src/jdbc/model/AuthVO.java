package jdbc.model;

public class AuthVO {

	//특별한 알고리즘을 가진 클래스가 아니라, 조회한 데이터를 저장할 클래스
	//1. 변수는 은닉하고, 테이블이 가지고 있는 멤버변수를 그대로 사용합니다.
	//2. getter, setter
	
	private int auth_id;
	private String name;
	private String job; //테이블의 컬럼을 그대로 사용
	
	//생성자 - 기본생성자, 매개변수 생성자(모든 멤버변수를 저장하는)
	public AuthVO() { /* ctrl + shift + enter */ }

	public AuthVO(int auth_id, String name, String job) {
		super();
		this.auth_id = auth_id;
		this.name = name;
		this.job = job;
	}

	//toString메서드 오버라이딩
	@Override
	public String toString() {
		return "AuthVO [auth_id=" + auth_id + ", name=" + name + ", job=" + job + "]";
	}
	
	//getter, setter
	public int getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
}
