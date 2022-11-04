package day07.encap.good;
public class Member {

//	회원정보 저장
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private int age;

//	기본 생성자 ctrl + space + enter
	public Member() {
		
	}
	
//	생성자 자동완성 alt + shift + s 또는 source탭 -> generate constructor using fields
	public Member(String id, String pw, String name, String address, int age) {
		super(); // 들어가 있기!
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
//	getter, setter -> 12개
//	자동완성  alt + shift + s 또는 source탭 -> generate getters and setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
