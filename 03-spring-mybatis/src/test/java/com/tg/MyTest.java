package com.tg;

import com.tg.dao.UserDao;
import com.tg.domain.User;
import com.tg.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String ac="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(ac);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String name:beanDefinitionNames){
            System.out.println(name);
        }
        System.out.println("============================");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> users = userDao.selectAll();
        for (User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void test02(){
        String ac="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(ac);
        UserService userService = (UserService) applicationContext.getBean("userService");
        User user = new User(123,"法外狂徒","123","男","nanqiang@qq.com");
        userService.addUser(user);
    }
}
