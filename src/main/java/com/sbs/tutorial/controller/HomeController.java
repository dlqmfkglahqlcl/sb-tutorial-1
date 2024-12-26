package com.sbs.tutorial.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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
    @GetMapping("/home/returnDouble")
    @ResponseBody
    public Double showReturnDouble() {
        return Math.PI;
    }

    @GetMapping("/home/Array")
    @ResponseBody
    public int[] showReturnArray() {
        int[] arr = new int[]{10, 20, 30};
        return arr;
    }

    @GetMapping("/home/List")
    @ResponseBody
    public List<Integer> showReturnList() {
        List<Integer> list = new ArrayList<>(){{
            add(10);
            add(20);
            add(30);
        }};
        return list;
    }

    @GetMapping("/home/Map")
    @ResponseBody
    public Map<String, Object> showReturnMap() {
        Map<String, Object>map = new LinkedHashMap<>();
        map.put("id", 1);
        map.put("subject", "제목1");
        map.put("content", "내용1");
        map.put("writerName", "김철수");
        map.put("articleNo", new ArrayList<>(){{add(1);}});

        return map;
    }
}
