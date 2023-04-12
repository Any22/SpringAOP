package com.demo.springAop.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CurrentAccount implements Register {
    @Override
    public boolean registerToAccount(String registerType)
    {
        return( (registerType == "CurrentAccount")? true:false );
    }


}
