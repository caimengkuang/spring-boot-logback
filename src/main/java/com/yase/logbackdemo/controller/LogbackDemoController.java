package com.yase.logbackdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yase
 * @data 2018/10/22
 */
@RestController
public class LogbackDemoController {

    private static final Logger logger = LoggerFactory.getLogger(LogbackDemoController.class);

    @GetMapping(value = "/test2")
    public void test2(){
        System.out.println("test2 start.");
        logger.trace("test2 trace");
        logger.debug("test2 debug");
        logger.info("test2 info");
        logger.warn("test2 warn");
        logger.error("test2 error");
        System.out.println("test2 end.");
    }


}
