package day01;

public class VariableScope {

	public static void main(String[] args) {
		
		int num1 = 10; // 타입이 같으면 혹은 옆으로 ,해서 사용 가능 (int num1 = 10, num2 = 20;)
		int num2 = 20;
		int num4 = 0; // 초기값
		
//		변수는 해당 중괄호 안에서만 사용할 수 있습니다.
//		main 안에서 만들어진 변수를 지역변수라고 부릅니다.
		
		if(true) {
			
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num4 = 200; //변경가능
		}
		
		
		int num3 = 100;
		System.out.println(num3); //100, 범위 밖에 또 변수를 선언하면 num3 나오는게 가능
		
		System.out.println(num4);
		
		
	}
}
