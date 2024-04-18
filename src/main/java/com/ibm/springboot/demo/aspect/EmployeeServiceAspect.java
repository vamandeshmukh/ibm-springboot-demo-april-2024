package com.ibm.springboot.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

//	@Before("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceMethods() {
//		LOG.info("a method from EmployeeServiceImpl was invoked.");
//	}

//	@After("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceMethods2() {
//		LOG.info("After a method from EmployeeServiceImpl was invoked.");
//	}

	@AfterReturning("execution(* com.ibm.springboot.demo.service.*.*(..))")
	public void serviceSuccess() {
		// assignment for today 
		// 1. send email to a specific id , use yahoo mail 
		// 2. get to know spring actuator 
		// 3. basic understanding of microservices 
		LOG.info("Data returned successfully");
	}

	@AfterThrowing("execution(* com.ibm.springboot.demo.service.*.*(..))")
	public void serviceFailed() {
		LOG.info("Data could not be returned");
	}

	@Before("execution(* com.ibm.springboot.demo.service.*.*(..))")
	public void beforeAdvice(JoinPoint jp) {
		if (jp.getArgs().length > 0)
			LOG.info(jp.getArgs().toString());
		LOG.info(jp.getSignature().toString());
		LOG.info(jp.getTarget().toString());
	}

}

//package com.ibm.springboot.demo.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class EmployeeServiceAspect {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Pointcut("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceMethods() {
//	}
//
//	@Before("serviceMethods()")
//	public void beforeEmployeeServiceMethod() {
//		LOG.info("Employee service method invoked.");
//	}
//
//}
