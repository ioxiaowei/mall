package io.xiaowei.order;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("io.xiaowei.order.dao")
public class MallOrderApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallOrderApplication.class, args);
            log.info("订单服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("订单服务启动失败", e);
        }
    }

}
