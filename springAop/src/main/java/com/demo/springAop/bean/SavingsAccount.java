package com.demo.springAop.bean;

import org.springframework.stereotype.Component;

@Component
public class SavingsAccount implements Register{
    @Override
    public boolean registerToAccount(String registerType)
    {
        return( (registerType == "SavingsAccount")? true:false );
    }

}
