package _api.io.serializable;

import java.io.Serializable;
import java.util.Date;

//인스턴스 단위로 읽고 쓰기가 가능한 클래스 - Serializable 인터페이스 때문
public class SingerDTO implements Serializable{

	private int num;
	private String name;
	private Date birthday;
	
	public SingerDTO() {
		super();
	}
	
	public SingerDTO(int num, String name, Date birthday) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
	}
	
	
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	@Override
	public String toString() {
		return "SingerDTO [num=" + num + ", name=" + name + ", birthday=" + birthday + "]";
	}
}
