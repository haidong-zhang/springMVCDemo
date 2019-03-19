package com.haidong.vo.in;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author: Don
 * @Date: 2019/3/19 23:36
 */
public class Person {
    
    @NotBlank
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
