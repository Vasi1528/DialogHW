package com.example.dialoghw;

public class FirstClass {
    private String name;
    private int age;


    public FirstClass(String name) {
        this.name = name;
    }

    public FirstClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
