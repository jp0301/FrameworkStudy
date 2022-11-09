/* 
 * ========================================================
 * OracleDAO.java
 * - DAO 구성
 * - MssqlDAO 와 비교하여 설정만 다르게 구성하여 실습 진행
 * ========================================================
 */

package com.test.spr;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import com.util.spr.DBConn;

public class OracleDAO implements IDAO {
		

	
	@Override
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException
	{
		List<MemberDTO> result = new ArrayList<MemberDTO>();
		
		// 데이터 베이스 연결
		//Connection conn = DBConn.getConnection("jdbc:oracle:thin:@211.238.142.56:1521:xe", "scott");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.48:1521:xe", "scott", "tiger");		
		
		// select 쿼리문 준비 및 실행
		String sql = "SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST";
		
		//PreparedStatement pstmt = conn.prepareStatement(sql);
		Statement stmt = conn.createStatement();
		//ResultSet rs = pstmt.executeQuery();
		ResultSet rs = stmt.executeQuery(sql);
		

		// 작업 객체의 수행 결과 얻어낸
		// 결과 집합을 컬렉션(result)에 추가
		while(rs.next())
		{
			MemberDTO dto = new MemberDTO();
			
			dto.setId(rs.getString("ID"));
			dto.setName(rs.getString("NAME"));
			dto.setTel(rs.getString("TEL"));
			dto.setEmail(rs.getString("EMAIL"));
			
			result.add(dto);
		}
		// 리소스 반납
		rs.close();
		//pstmt.close();
		stmt.close();
		
		// 데이터베이스 연결 종료
		if (!conn.isClosed()) {
			conn.close();
		}
		
		// 최종 결과값 반환
		return result;
	}
	

}
