/*==================================================
 * Main.java
 * - main() 메소드가 포함된 테스트 클래스
 *==================================================*/


package com.test.spr;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		/*
		 * IDAO dao1 = new OracleDAO(); IDAO dao2 = new MssqlDAO();
		 * 
		 * MemberList member = new MemberList();
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * while(true) {
		 * System.out.print("1 = OracleDAO , 2 = MssqlDAO , 0 = 종료 / 선택: "); int num =
		 * sc.nextInt();
		 * 
		 * if (num == 1) { member.setDao(dao1); member.print(); } else if (num == 2) {
		 * member.setDao(dao2); member.print(); } else if (num == 0) { break; } }
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MemberList list = context.getBean("memberlist", MemberList.class);
		list.print();
		

		
	
	}
}
