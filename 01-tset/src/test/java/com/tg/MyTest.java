package com.tg;

import com.tg.domain.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {

    @Test
    public void test01(){
        String configLocation = "ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        Date myDate = (Date) applicationContext.getBean("myDate");
        System.out.println(myDate);
    }

    @Test
    public void test02(){
        String configLocation = "ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        Student student = (Student) applicationContext.getBean("stu01");
        System.out.println(student);
    }
    @Test
    public void test03(){
        String configLocation = "ApplicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
        Student student = (Student) applicationContext.getBean("stu02");
        System.out.println(student);
    }
}
