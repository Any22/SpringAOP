package com.demo.springAop.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Customer {
   @Autowired
   private Register register;
    
    public void registerAccount(String accountType){
    	
        if (register.registerToAccount(accountType)){
            System.out.println("Customer registered for an account type : "+accountType);
            
        } else {
            System.out.println("Customer not registered ");
        }
		

    }
}

