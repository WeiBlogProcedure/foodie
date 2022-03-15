package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/10/8 4:34 下午
 * @Version 1.0
 **/

/**
 * 默认所有请求返回出去的都是一个json对象，是@ResponseBody和@Controller的组合注解
 */
@RestController
public class HelloController {

    /**
     *
     * @return
     */
    @GetMapping("/hello")
    public Object hello() {
        return "Hello World";
    }
}
