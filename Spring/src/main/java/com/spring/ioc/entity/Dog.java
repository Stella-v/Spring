package com.spring.ioc.entity;

/**
 * @Description:
 * @author： see
 * @date： 2021-10-21 9:23 PM
 * @Version:
 */
public class Dog {

    private String name;
    private String age;

    public Dog() {
    }

    public Dog(String name, String age) {
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
