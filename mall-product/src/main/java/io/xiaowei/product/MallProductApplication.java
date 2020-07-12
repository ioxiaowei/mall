package io.xiaowei.product;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan(basePackages = "io.xiaowei.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallProductApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
