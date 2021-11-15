package com.spring.ioc.entity;

/**
 * @Description:
 * @author： see
 * @date： 2021-10-21 9:52 PM
 * @Version:
 */
public class Person {
    private String name;
    private Clothes clothes;

    public Person() {
    }

    public Person(String name, Clothes clothes) {
        this.name = name;
        this.clothes = clothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void dress(){
        System.out.println(this.name + "穿着" + this.clothes.getColor() + this.clothes.getStyle());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", clothes=" + clothes +
                '}';
    }
}
