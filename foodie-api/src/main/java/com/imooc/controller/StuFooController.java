package com.imooc.controller;

import com.imooc.service.StuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName StuFooController
 * @Description TODO
 * @Author lixinwei
 * @Date 2022/3/15 10:52 下午
 * @Version 1.0
 **/
@RestController
public class StuFooController {

    @Autowired
    private StuService stuService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/getStu", method = RequestMethod.GET)
    public Object getStu(@RequestParam int id) {
        logger.info("requestParam = {}",id);
        return stuService.getStuInfo(id);
    }

    @RequestMapping(value = "/saveStu", method = RequestMethod.POST)
    public Object saveStu() {
        stuService.saveStu();
        return "OK";
    }

    @RequestMapping(value = "/updateStu", method = RequestMethod.POST)
    public Object updateStu(@RequestParam int id) {
        logger.info("requestParam = {}",id);
        stuService.updateStu(id);
        return "OK";
    }

    @RequestMapping(value = "/deleteStu", method = RequestMethod.POST)
    public Object deleteStu(@RequestParam int id) {
        logger.info("requestParam = {}",id);
        stuService.deleteStu(id);
        return "OK";
    }
}
