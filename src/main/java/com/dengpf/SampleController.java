package com.dengpf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kobe73er on 17/1/6.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class    SampleController {

    @Autowired
    private RedisSettings redisSettings;

    @RequestMapping("/yaml")
    @ResponseBody
    String yaml() {
        return redisSettings.getHost();

    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}