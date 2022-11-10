package com.test.spr;

public class Main
{
	public static void main(String[] args)
	{
		
		IDAO dao1 = new OracleDAO();
		//IDAO dao2 = new MssqlDAO();
		
		MemberList list = new MemberList();
		
		
		list.setDao(dao1);
		list.print();
		
		
		
	}
}
