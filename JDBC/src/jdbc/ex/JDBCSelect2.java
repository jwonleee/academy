package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {

	public static void main(String[] args) {
		
		/*
		 * 사원수를 입력받습니다.
		 * employees, departments 테이블에서 부서별 사원수가 입력받은 사원수보다 큰 데이터를 select
		 * 출력할 컬럼은 부서명, 사원수, 부서아이디
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사원수 입력>");
		String tmp = scan.nextLine();
		int c = Integer.parseInt(tmp);
		
		//변수선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소, @작성해야함
		String uid = "hr"; //계정 아이디
		String upw = "hr"; //비밀번호
		
		String sql = "select d.department_name, a.total, d.department_id\r\n"
					+ "from departments d\r\n"
					+ "inner join (select department_id, count(*) as total\r\n"
					+ "            from employees e\r\n"
					+ "            group by department_id) a\r\n"
					+ "on d.department_id = a.department_id\r\n"
					+ "where total > ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select결과를 반환받을 객체
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, c); //물음표의 내용을 적어줌
			
			//sql
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //한줄이면 한번, 여러줄이면 여러번 실행
				String department_name = rs.getString("department_name");
				int total = rs.getInt("total");
				int department_id = rs.getInt("department_id");
				
				System.out.println("부서명:" + department_name + ", 사원수:" + total + ",부서아이디:" + department_id);
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
