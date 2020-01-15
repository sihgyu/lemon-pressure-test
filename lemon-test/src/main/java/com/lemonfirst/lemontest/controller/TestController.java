package com.lemonfirst.lemontest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yusx
 * @date 2020/1/12 5:49 下午
 * @Description 健康检查
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @RequestMapping("/health_check")
    public Map<String,String> healthCheck(){
        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("模块名称","lemon-test");
        resultMap.put("项目启动状态","ok");
        return resultMap;
    }
}
