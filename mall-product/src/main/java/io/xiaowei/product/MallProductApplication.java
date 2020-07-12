package io.xiaowei.product;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "io.xiaowei.product.dao")
public class MallProductApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallProductApplication.class, args);
            log.info("商品服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("商品服务启动失败", e);
        }
    }

}
