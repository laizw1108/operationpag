package com.zoe.operation.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    protected static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/{srv}", method = RequestMethod.GET)
    public String test(@PathVariable String srv) {
        logger.info(srv);
        return  srv;
    }
}
