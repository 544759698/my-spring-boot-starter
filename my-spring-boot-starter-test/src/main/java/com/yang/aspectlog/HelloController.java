package com.yang.aspectlog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangguojun01
 * @Date: 2020/8/9
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/hello")
    @AspectLog
    public String hello() {
        try {
            Thread.sleep(500L);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "hello";
    }

}
