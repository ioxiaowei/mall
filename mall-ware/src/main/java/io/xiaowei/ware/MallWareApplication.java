package io.xiaowei.ware;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "io.xiaowei.ware.dao")
public class MallWareApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallWareApplication.class, args);
            log.info("仓储服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("仓促服务启动失败", e);
        }
    }

}
