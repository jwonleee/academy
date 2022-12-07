package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {

	public static void main(String[] args) {
		
		//insert
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소, @작성해야함
		String uid = "hr"; //계정 아이디
		String upw = "hr"; //비밀번호
		
		
		String sql = "insert into auth values( seq_auth.nextval , ?, ?)"; //auth 컬럼 3개임
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		// throws exception을 던지니까 try-catch
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//connection
			conn = DriverManager.getConnection(url, uid, upw);
			
			//statement 객체
			pstmt = conn.prepareStatement(sql);
			
			//?값 세팅 - 첫번째부터 1번 순서 (setString, setInt, setDate, setTimestamp)
			pstmt.setString(1, "홍길동"); //1은 물음표를 나타냄, 물음표가 2개 이므로 1,2가 나옴
			pstmt.setString(2, "프로그래머"); //직접 값을 적지 않고 변수화 가능
			
			//sql 실행 (select문은 query 문장으로 실행, i, d, u문은 update 메서드로 실행) - i,d,u는 완전 똑같음 sql문만 바뀜
			int result = pstmt.executeUpdate(); //업데이트문은 정수형 반환, 성공(1), 실패(0) 반환
			// executeUpdate는 정수형 반환
			if(result == 1) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
			}
			
		}catch(Exception e ) {
			e.printStackTrace(); //에러 로그를 봐야 하니까
		} finally {
			
			try { //객체 계속 쌓여서 close 필수로 해줌
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
			
		}
		
		
		
		
		
		
	}
}
