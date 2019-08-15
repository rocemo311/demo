package com.example.demo.controller;

/**
 * ClassName: TestController
 *
 * @author liupengcheng
 * @Date 2019/3/20
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @GetMapping(value = "/test")
    public static String test(){
		String a = "456";
		String b = "789";
		String c = "888";
        return "helloWorld";
    }

}
