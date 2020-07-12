package io.xiaowei.coupon;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("io.xiaowei.coupon.dao")
public class MallCouponApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallCouponApplication.class, args);
            log.info("营销服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("营销服务启动失败", e);
        }
    }

}
