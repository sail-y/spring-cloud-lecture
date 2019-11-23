package com.test.springlecture.controller;
import java.util.Date;

import com.test.springlecture.config.MyConfigBean;
import com.test.springlecture.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangfan
 */
@RestController
@RequestMapping("/api")
public class MyController {

    @Value("${myConfig.myObject.myName")
    private String myName;

    @Value("${myConfig.myObject.myAge")
    private String myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @GetMapping("/person")
    public Person getPerson() {
        Person person = new Person();
        person.setId(18);
        person.setName("张三");
        person.setBirthday(new Date());

        System.out.println(myName);
        System.out.println(myAge);

        System.out.println(myConfigBean.getMyName());
        System.out.println(myConfigBean.getMyAge());

        return person;
    }
}