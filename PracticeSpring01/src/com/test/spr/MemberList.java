package com.test.spr;

public class MemberList
{
	
	public IDAO dao;
	
	
	public void setDao(IDAO dao)
	{
		this.dao = dao;
	}
	
	public void print()
	{
		
		try
		{
			for (MemberDTO dto : dao.list())
			{
				System.out.printf("%s %s %s %s\n", dto.getId(), dto.getName(), dto.getTel(), dto.getEmail());
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
	
}
