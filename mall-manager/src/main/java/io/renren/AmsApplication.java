package io.renren;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author xiaowei_wang
 * @Description 启动类
 * @Date 12:53 上午 2020/7/12
 * @Param
 * @return
 **/
@Slf4j
@SpringBootApplication
public class AmsApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(AmsApplication.class, args);
            log.info("AMS Start Success");
        } catch (Exception e) {
            log.error("AMS Start Fail");
        }
    }

}