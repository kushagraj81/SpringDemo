package com.example.basiccontroller;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Mydetails {
    public String getKushDetails(){
        return "Kushagra is a very ambitious and strong willed man!!";
    }
    @PostConstruct
    public void postConstruct()
    {
        System.out.println("post construct called---->" + getClass().getName());
    }
    @PreDestroy
    public void predestroy()
    {
        System.out.println("pre destroy called ---> "+getClass().getName());
    }
}
