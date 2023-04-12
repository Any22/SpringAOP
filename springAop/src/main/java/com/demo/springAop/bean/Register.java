package com.demo.springAop.bean;

import org.springframework.stereotype.Component;

@Component
public interface Register {
    public boolean registerToAccount(String registerType);
}
