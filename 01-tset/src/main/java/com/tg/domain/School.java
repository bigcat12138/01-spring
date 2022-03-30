package com.tg.domain;

public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("School 的无参数方法执行了！！！");
    }

    public School(String name, String address) {
        System.out.println("School 的有参数构造方法执行了！！");
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
