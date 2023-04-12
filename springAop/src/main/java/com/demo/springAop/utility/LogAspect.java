package com.demo.springAop.utility;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect{
	
    public static final Log LOGGER = LogFactory.getLog(LogAspect.class);
    @Before ("execution (* com.demo.springAop.bean.Customer.registerAccount(..))")
    public void before() throws Exception {
        LOGGER.info("Valid credentials");
    }
    
    @After ("execution (* com.demo.springAop.bean.Customer.registerAccount(..))")
    public void after() throws Exception {
        LOGGER.info("Customer is registered finally");
    }
   
    @AfterReturning ("execution (* com.demo.springAop.bean.Customer.registerAccount(..))")
    public void afterReturning() throws Exception {
        LOGGER.info("Customer is registered!");
    }

  
}




