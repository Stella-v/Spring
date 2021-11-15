package com.spring.ioc.entity;

/**
 * @Description: Cat
 * @author： see
 * @date： 2021-10-21 9:20 PM
 * @Version:
 */
public class Cat {
    private String name;
    private String age;

    public Cat() {
    }

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
