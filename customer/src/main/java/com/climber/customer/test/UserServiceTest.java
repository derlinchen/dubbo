package com.climber.customer.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.climber.bean.User;
import com.climber.service.UserService;

public class UserServiceTest {

	private UserService userService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/dubbo-*.xml");
        userService = applicationContext.getBean(UserService.class);
    }

    @Test
    public void testQueryAll() {
        List<User> userList = userService.queryAll();
        for(User user : userList){
            System.out.println(user.toString());
        }
    }
    
}
