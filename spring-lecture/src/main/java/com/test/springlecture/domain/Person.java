package com.test.springlecture.domain;

import java.util.Date;

/**
 * @author yangfan
 * @date 2019/04/10
 */
public class Person {
    private int id;

    private String name;

    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
