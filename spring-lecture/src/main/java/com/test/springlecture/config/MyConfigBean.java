package com.test.springlecture.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author yangfan
 * @date 2019/04/15
 */
public class MyConfigBean {
    @Value("${myConfig.myObject.myName")
    private String myName;

    @Value("${myConfig.myObject.myAge")
    private String myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyAge() {
        return myAge;
    }

    public void setMyAge(String myAge) {
        this.myAge = myAge;
    }
}
