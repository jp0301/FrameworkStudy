/* ===============================
 * CalculatorBeforeAdvice.java
 * - After Throwing Advice 구성
 * =============================== 
 * */

package com.test.spr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

public class CalculatorAfterThrowing implements ThrowsAdvice
{
	// 다른 것들은 implements 하면 에러가 발생되는데 .. 왜? 추상이되기때문
	// 하지만 얘는 그런것이없다.
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable
	{
		//e. ...;
		
		Log log = LogFactory.getLog(this.getClass());
		log.info("After Throwing Advice 실행 ==========================");
		log.info("주 업무 실행 과정에서 예외 발생 시 처리되는 사후 업무");
		log.info("After Throwing Advice 실행 ==========================");
		
		
	}
		
}
