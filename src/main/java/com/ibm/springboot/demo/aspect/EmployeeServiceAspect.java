package com.ibm.springboot.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

}




//package com.ibm.springboot.demo.aspect;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
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
