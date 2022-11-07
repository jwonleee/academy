package day09.inter.basic2;

public class Basic implements BasicInter{

	public void insert(int a) {
		System.out.println("insert....");
	}

	public void info() {
		System.out.println("info....");
	}

	public String getInfo() {
		System.out.println("getInfo....");
		return "getInfo";
	}

	public int delete(int a) {
		System.out.println("delete....");
		return 0;
	}
//	클래스가 가져야할 메서드를 interface에 정의
	
	
	
	
}
