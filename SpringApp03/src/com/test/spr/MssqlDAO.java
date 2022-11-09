/* 
 * ========================================================
 * MssqlDAO.java
 * - DAO 구성
 * - OracleDAO 와 비교하여 설정만 다르게 구성하여 실습 진행
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

public class MssqlDAO implements IDAO {
		

	
	@Override
	public List<MemberDTO> list() throws ClassNotFoundException, SQLException
	{
		List<MemberDTO> result = new ArrayList<MemberDTO>();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@211.238.142.49:1521:xe", "scott", "tiger");		
		
		String sql = "SELECT ID, NAME, TEL, EMAIL FROM TBL_MEMBERLIST";
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			MemberDTO dto = new MemberDTO();
			
			dto.setId(rs.getString("ID"));
			dto.setName(rs.getString("NAME"));
			dto.setTel(rs.getString("TEL"));
			dto.setEmail(rs.getString("EMAIL"));
			
			result.add(dto);
		}
		rs.close();
		stmt.close();
		
		if (!conn.isClosed()) {
			conn.close();
		}
		return result;
	}
	

}