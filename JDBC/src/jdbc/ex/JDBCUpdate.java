package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("auth_id 입력>");
		String tmp = scan.nextLine();
		int auth_id = Integer.parseInt(tmp);
		System.out.println("name 입력>");
		String name = scan.nextLine();
		System.out.println("job 입력>");
		String job = scan.nextLine();
		
		//변수선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소, @작성해야함
		String uid = "hr"; //계정 아이디
		String upw = "hr"; //비밀번호
		
		//스캐너로 auth_id, name, job을 입력받아서 해당 auth_id의 name, job을 업데이트 하는 구문.
		String sql = "update auth set name = ?, job = ? where auth_id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connection
			conn = DriverManager.getConnection(url, uid, upw);
			//statement 객체
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name); //str
			pstmt.setString(2, job); //str
			pstmt.setInt(3, auth_id); //number
			
			//sql 실행
			int result = pstmt.executeUpdate(); // 1 or 0
			
			if(result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try { //객체 계속 쌓여서 close 필수로 해줌
				conn.close();
				pstmt.close();
				scan.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
		
		}
		
		
	}
}
