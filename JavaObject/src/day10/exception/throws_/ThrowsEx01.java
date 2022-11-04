package day10.exception.throws_;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
//		메서드에서 예외처리 - throws
//		throws 구문이 붙어있는 메서드 ar 생성자를 호출할때는 예외를 대신 처리애햐 합니다.
//		즉 메서드안에서 예외처리를 강요할 때 사용합니다.
		try { // 호출문장 안에서 예외처리 해줘야 함
			
			greeting(0);
			greeting(1);
			greeting(2);
			greeting(3);
			greeting(4);

		} catch (Exception e) {
			System.out.println("배열 참조를 벗어났습니다");
		}

	
	System.out.println("------------------");
	
	try {
		calc(0);
	} catch (Exception e) {
		System.out.println("\"0으로 나눌 수 없습니다.");
	}
	
	System.out.println("------------------");
	try {
		greeting(5);
	} catch (Exception e) {
//		예외처리를 하면 예외의 내용을 알수가 없기 때문에,
//		예외의 내용을 확인하기 위해서 catch영역에서는 항상 사용합니다.
		e.printStackTrace();
	}
	
	System.out.println("프로그램 정상 종료");
	
	}
//	static
	private static String[] arr = {"안녕하세요", "hello", "니하오", "곤니찌와" };
	
	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}
	
	public static void calc(int num) throws ArithmeticException {
		System.out.println(10 / num);
	}
	
	
	
	

}
