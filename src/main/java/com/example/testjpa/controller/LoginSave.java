package com.example.testjpa.controller;

import com.example.testjpa.annotation.SystemControllerLog;
import com.example.testjpa.po.User;
import com.example.testjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
class LoginSave{

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/save")
    @SystemControllerLog(description = "保存用户")
    public void saveValue(HttpServletRequest request)
    {
        User user = new User();
        user.id = 7;
        user.name = "lhl7";
        HttpSession session = request.getSession();
        //往session中存入你想要的东西
        session.setAttribute("user", user);
        userService.saveBlog(user);
    }

//    @ResponseBody
    @GetMapping("/user/{id}")
    public String selectUser(@PathVariable Integer id, Model model)
    {
        List<User> users= userService.selectUserById(id);
        User user = users.get(0);
        User user1 = new User();
        user1.name = "lhl";
        User user2 = new User();
        user2.name = "lhl2";

        List<User> userTest = new ArrayList<>();
        userTest.add(user1);
        userTest.add(user2);
        model.addAttribute("users",userTest);

        testDebug(8);

        return "userInfo";
    }

    //@ResponseBody
    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id, Model model)
    {
        //这里的id是一个变量
        //model.addAttribute("blog",blogService.getAndConvert(id));
        return "userInfo";
    }

    public void testDebug(int value)
    {
        System.out.println("hello"+value);
    }

    //@ResponseBody
    @GetMapping("/blog/{test}")
    public String blogTest(@PathVariable Long id, Model model)
    {
        //这里的id是一个变量
        //model.addAttribute("blog",blogService.getAndConvert(id));
        return "userInfo";
    }
}