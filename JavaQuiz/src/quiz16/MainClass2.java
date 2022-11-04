package quiz16;

public class MainClass2 {

public static void main(String[] args) {
		
		try {
			Calculator.input();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		
		} finally { // 여기서는 없어도 됨
			System.out.println("입력을 종료합니다");
		}
		
	}
}
