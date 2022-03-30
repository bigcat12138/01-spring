package com.tg.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aop01 {
    @Before("execution(public void com.tg.Student.study())")
    public void getUp(){
        System.out.println("张三起床了");
    }
}
