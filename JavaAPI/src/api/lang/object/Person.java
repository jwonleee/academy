package api.lang.object;

public class Person /*extends Object*/ implements Cloneable{

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	오버라이딩 - toString: 멤버변수 한눈에 확인하는 역할
//	gernerate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

//	멤버변수명이 같으면 true 반환
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p1 = (Person)obj;
		
			String n = p1.getName();
			if(n.equals(this.name)) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		return false;
//		return super.equals(obj);
	}

//	clone 메서드를 사용하고 싶다면 override
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
