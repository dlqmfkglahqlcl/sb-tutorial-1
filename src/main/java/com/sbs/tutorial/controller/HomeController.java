package com.sbs.tutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
    int num;
    public HomeController(){
        int num = 0;
    }
    @GetMapping("/home/main")
    @ResponseBody
    public String showHome(){
        return "안녕하세요.!!!!!!!!!!!!!!";
    }

    @GetMapping("/home/main2")
    @ResponseBody

    public String showHome2(){
        return "환영합니다";
    }
    @GetMapping("/home/main3")
    @ResponseBody

    public String showHome3(){
        return "스트링부트는 획기적이다";
    }

    @GetMapping("/home/increase")
    @ResponseBody

    public int showIncrease(){
        num++;
        return num;
    }

    @GetMapping("/home/plus")
    @ResponseBody

    public int showPlus(@RequestParam(defaultValue = "0")int a, int b){
        return a + b;
    }

}
