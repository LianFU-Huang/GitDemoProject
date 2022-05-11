package com.example.gitdemoproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {
    @ResponseBody
    @RequestMapping("dblab")
    public String hello() {
        return "hello,dblab!";
    }
}
