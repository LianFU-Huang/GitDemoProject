package com.example.gitdemoproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloController {

    @RequestMapping("hello")
    public String hello() {
        String time = new String();
        time = "第1次 创建项目";
        time += "第2次 添加内容";
        time += "第3次 添加内容";
        return time;
    }
}
