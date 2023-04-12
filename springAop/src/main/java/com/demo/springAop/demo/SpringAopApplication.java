package com.demo.springAop.demo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.demo.springAop.bean.Customer;
import com.demo.springAop.bean.Register;
import com.demo.springAop.utility.LogAspect;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.springAop")
public class SpringAopApplication implements CommandLineRunner{
	
	@Autowired
	Customer customer ;
	
	public static void main(String[] args) {
		 
	 SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		try {

			customer.registerAccount("CurrentAccount");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
