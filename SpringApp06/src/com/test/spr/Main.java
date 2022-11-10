/* ===============================
 * Main.java
 * - 클래스.
 * - main() 메소드가 포함된 테스트 클래스
 * =============================== 
 * */


package com.test.spr;

import java.lang.reflect.Proxy;

public class Main
{
	public static void main(String[] args)
	{
		// 주 업무를 실행할 수 있는 객체 준비
		//Caculator cal = new Calculator();
		
		// 『인터페이스 변수 = new 인터페이스구현클래스();』
		Calculator cal = new CalculatorImpl();
		
		// 메소드 호출을 통해 업무 실행 테스트
		/*
		int add = cal.add(10, 20);
		System.out.println(add);
		
		int sub = cal.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal.multi(10, 20);
		System.out.println(multi);
		
		int div = cal.div(10, 20);
		System.out.println(div);
		*/
		
		//Proxy.newProxyInstance(loader, interfaces, h)
		//Proxy.newProxyInstance(ⓐ, ⓑ, ⓒ)
		//ⓐ : 주 업무 실행 클래스에 대한 정보 전달(제공)
		//ⓑ : 주 업무 실행 클래스의 인터페이스에 대한 정보 전달(제공)
		//ⓒ : 보조 업무 실행 클래스에 대한 정보 전달(제공)  
		
		Calculator cal2 = (Calculator)Proxy.newProxyInstance(cal.getClass().getClassLoader()
														   , cal.getClass().getInterfaces() 
														   , new CalculatorProxy(cal));
		
		int add = cal2.add(10, 20);
		System.out.println(add);
		
		int sub = cal2.sub(10, 20);
		System.out.println(sub);
		
		int multi = cal2.multi(10, 20);
		System.out.println(multi);
		
		int div = cal2.div(10, 20);
		System.out.println(div);
		
		

	
	
	}
}
