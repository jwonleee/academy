package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect {

	public static void main(String[] args) {
		
		//insert
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소, @작성해야함
		String uid = "hr"; //계정 아이디
		String upw = "hr"; //비밀번호
		
		String sql = "select * from auth order by auth_id desc"; //?가 없으니까 아래에서 딱히 할게 없음
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //결과 저장 객체, select 결과를 반환받을 객체
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn
			conn = DriverManager.getConnection(url, uid, upw);
			//pstmt
			pstmt = conn.prepareStatement(sql);
			//?값에 대한 처리 x
			
			//sql 실행 (select의 실행 - 데이터를 가져오는 작업)
			rs = pstmt.executeQuery();
			//executeQuery는 ResultSet형으로 반환
			//그대로 실행된 결과가 rs에 담김
			
			while (rs.next()) { //다음 row가 있다면 true
				
				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id = rs.getInt("auth_id");
				String name = rs.getString("name"); //컬럼명
				String job = rs.getString("job");
				
				System.out.println("번호:" + auth_id + ", 이름:" + name + ",직업:" + job);
			
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { //객체 계속 쌓여서 close 필수로 해줌
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
		} //end try ~ catch ~ finally 

	} //end main
}
