/*==================================================
 * Main.java
 * - 클래스
 * - main() 메소드가 포함된 테스트 클래스
 *==================================================*/


package com.test.spr;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		MemberList member = new MemberList();
		
		member.ora_print();
		
		System.out.println("-----------------");
		
		member.ms_print();
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	
	}
}
