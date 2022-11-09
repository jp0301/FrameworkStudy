package com.test.spr;

public class MemberList {

	
	private OracleDAO ora_dao;
	private MssqlDAO ms_dao;
	
	public MemberList() {
		ora_dao = new OracleDAO();
		ms_dao = new MssqlDAO();
	}
	
	// oracle 전체 조회 출력 메소드
	public void ora_print() {
		try 
		{
			System.out.println("아이디     이름   전화번호    이메일");
			for (MemberDTO dto : ora_dao.list()) {
				System.out.printf("%6s %5s %10s %10s\n", dto.getId(), dto.getName(), dto.getTel(), dto.getEmail());
			}
			
		} catch (Exception e) {
//			System.out.println("에러발생");
			e.printStackTrace();
//			System.out.println(e.toString());
		}
	}
	
	public void ms_print() {
		try 
		{
			System.out.println("아이디     이름   전화번호    이메일");
			for (MemberDTO dto : ms_dao.list()) {
				System.out.printf("%6s %5s %10s %10s\n", dto.getId(), dto.getName(), dto.getTel(), dto.getEmail());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
