package com.yase.logbackdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author yase
 * @data 2018/10/22
 */
@RestController
public class LogbackController {

    private static final Logger logger = LoggerFactory.getLogger("matter");

    @GetMapping(value = "/test")
    public void test1(){
        System.out.println("LogbackDemoController.test1 test1 start.");
        logger.trace("LogbackDemoController.test1 test1 trace");
        logger.debug("LogbackDemoController.test1 test1 debug");
        logger.info("LogbackDemoController.test1 test1 info");
        logger.warn("LogbackDemoController.test1 test1 warn");
        logger.error("LogbackDemoController.test1 test1 error");
        System.out.println("test1 end.");
    }

}
