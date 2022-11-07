package day05;

public class VariableMain {

	public static void main(String[] args) {
		
		Variable var = new Variable(); // 생성
		
		var.printNum(1000);
		
		var.a = "바꿈"; // 멤버 변수는 class 밖에서 접근 가능
		var.printNum(1000);
	}
	
}
