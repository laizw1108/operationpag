package com.zoe.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@Controller
public class OperationpagApplication {

    public static void main(String[] args) {
        SpringApplication.run(OperationpagApplication.class, args);
    }

    /**
     * 登陆界面
     */
    @GetMapping("/")
    public ModelAndView login() {
        return new ModelAndView("index");
    }

}
