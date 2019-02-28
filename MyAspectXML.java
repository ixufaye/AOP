package cn.muc.spring.demo3;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * @author xufaye
 *
 */
public class MyAspectXML {

	/**
	 * 前置通知
	 */
	public void checkPri() {
		System.out.println("权限校验==================");
	}
	
	/**
	 * 后置通知：可以获得方法返回值（通过传入对象类型的参数）
	 */
	public void writeLog(Object result) {
		System.out.println("日志记录===============" + result);
	}
	/**
	 * 环绕通知：比如可以用于性能监控
	 * @throws Throwable 
	 */
	public Object watch(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前通知=========");
		Object obj = joinPoint.proceed();
		System.out.println("环绕后通知=========");
		return obj;
	}
	/**
	 * 异常抛出通知
	 */
	public void afterTrowing(Throwable ex) {
		System.out.println("异常抛出通知=========并获得异常信息：" + ex.getMessage());
	}
	
	/**
	 * 最终通知：无论有没有异常都会执行，相当于finally代码块中的内容
	 */
	public void after() {
		System.out.println("最终通知===========");
	}
}
