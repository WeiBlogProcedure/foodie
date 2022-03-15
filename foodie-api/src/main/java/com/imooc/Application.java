package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName Application
 * @Description TODO
 * @Author lixinwei
 * @Date 2021/10/8 4:32 下午
 * @Version 1.0
 **/
@SpringBootApplication
/**
 * 扫描 mybatis 通用 mapper所在的包
 */
@MapperScan(basePackages = "com.imooc.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
