/*==================================================
 * Main.java
 * - 클래스
 * - main() 메소드가 포함된 테스트 클래스
 *==================================================*/


package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	
	}
}
