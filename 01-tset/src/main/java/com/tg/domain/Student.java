package com.tg.domain;

import org.springframework.stereotype.Component;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name, int age, School school) {
        System.out.println("Student的有参数构造方法执行了！！");
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student() {
        System.out.println("Student 的无参数构造方法执行了！！");
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

    public School getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
