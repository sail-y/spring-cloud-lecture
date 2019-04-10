package com.test.springlecture.controller;
import java.util.Date;

import com.test.springlecture.domain.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangfan
 */
@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/test")
    public Object test() {
        Person person = new Person();
        person.setId(18);
        person.setName("zhangsan");
        person.setBirthday(new Date());

        return person;
    }
}