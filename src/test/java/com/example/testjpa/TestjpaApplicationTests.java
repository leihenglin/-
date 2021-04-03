package com.example.testjpa;

import com.example.testjpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//这里使用具体的application的名称
@SpringBootTest(classes = TestjpaApplication.class)

class TestjpaApplicationTests {

    @Autowired
    UserService userService;
    //@Test
    //void contextLoads() {
//        System.out.println(userService.saveBlog(1).toString());
//    }
}
