package cn.air.githubactions.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mali
 * @date: 2021-12-20 17:55
 **/
@RestController
@Slf4j
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        log.info("hello world");

        return "hello world";
    }
}
