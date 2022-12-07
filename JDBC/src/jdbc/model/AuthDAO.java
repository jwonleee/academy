package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AuthDAO { //단순 연결

	//멤버변수
	private String url = MainClass.URL; //주소, @작성해야함
	private String uid = MainClass.UID; //계정 아이디
	private String upw = MainClass.UPW; //비밀번호
	
	//메서드화 - 데이터베이스 작업(insert,select 등)만, 스캐너같은 작업은 main에서
	//성공실패를 받기 위해서 int형 메서드, 매개변수는 MainClass의 스캐너값 받으려고
	public int insertEx(String name, String job) {
		int result = 0;
		
		
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
			pstmt.setString(1, name); //1은 물음표를 나타냄, 물음표가 2개 이므로 1,2가 나옴
			pstmt.setString(2, job); //직접 값을 적지 않고 변수화 가능
			
			//sql 실행 (select문은 query 문장으로 실행, i, d, u문은 update 메서드로 실행) - i,d,u는 완전 똑같음 sql문만 바뀜
			result = pstmt.executeUpdate(); //업데이트문은 정수형 반환, 성공(1), 실패(0) 반환
			
			
		}catch(Exception e ) {
			e.printStackTrace(); //에러 로그를 봐야 하니까
		}finally {
			
			try { //객체 계속 쌓여서 close 필수로 해줌
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
			
		}
		
		
		return result; //성공하면 sql값 반환, 실패하면 0 반환
	}
	
	
	//조회메서드
	public ArrayList<AuthVO> selectEx() {
		
		ArrayList<AuthVO> list = new ArrayList<>();
		
		
		String sql = "select * from auth order by auth_id desc"; //?가 없으니까 아래에서 딱히 할게 없음
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //결과 저장 객체, select 결과를 반환받을 객체
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn
			conn = DriverManager.getConnection(url, uid, upw);
			//stmt
			pstmt = conn.prepareStatement(sql);
			//?값에 대한 처리 x
			
			//sql 실행 (select의 실행)
			rs = pstmt.executeQuery();
			//executeQuery는 ResultSet형으로 반환
			//그대로 실행된 결과가 rs에 담김
			
			while (rs.next()) { //다음 row가 있다면 true
				
				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id = rs.getInt("auth_id");
				String name = rs.getString("name"); //컬럼명
				String job = rs.getString("job");
				
				//ORM 작업 = 데이터바인딩
				//vo에 행 데이터 저장
				//vo를 list에 저장
				AuthVO vo = new AuthVO(auth_id, name, job);
				list.add(vo);
				
			}
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try { //객체 계속 쌓여서 close 필수로 해줌
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				System.out.println("close 에러");
			}
			
		}
		
		
		return list;
	}
	
	
	
	
	
}
