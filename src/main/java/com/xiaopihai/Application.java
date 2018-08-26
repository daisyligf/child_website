package com.xiaopihai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author daisyli
 * @create 下午3:23
 **/
@SpringBootApplication
//@MapperScan("com.xiaopihai.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
