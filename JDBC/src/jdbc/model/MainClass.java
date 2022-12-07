package jdbc.model;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	//상수 사용시 데이터베이스가 바뀌면 여기만 바뀌면 됨
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String UID = "hr";
	public static final String UPW = "hr";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//DAO 클래스 선언
		AuthDAO authDAO = new AuthDAO();
		String menu = "";
		
		while(true) {
			
			try {
				System.out.println("메뉴 [ 1.저장, 2.조회 ] \n>");
				
				menu = scan.nextLine();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
				
				
				switch (menu) {
				case "1" :
					System.out.print("이름>");
					String name = scan.nextLine();
					System.out.print("직업>");
					String job = scan.nextLine();
					
					//이 아래부터 1끝까지 메서드화 되어 AuthDAO로 들어가야 함
					int result = authDAO.insertEx(name, job);
					
					if (result == 1) {
						System.out.println("정상 값이 입력되었습니다");
					} else {
						System.out.println("입력 오류 발생");
					}
					break;
				
				case "2":
					
					ArrayList<AuthVO> list = authDAO.selectEx();
					for(AuthVO vo : list) {
						System.out.println(vo.toString());
					}
					
					break;
					
					
				default:
					
					break;
				}
		
				
			
			
		}
		
		
	}
}
