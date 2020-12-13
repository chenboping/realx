package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloConlloer
 * @Description: TODO
 * @author: cbp
 * @date: 2020/11/18 0018  上午 9:11
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/man")
    public String man(){
        return "好兄弟，一辈子！";
    }

}
