package io.xiaowei.member;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "io.xiaowei.member.feign")
@MapperScan("io.xiaowei.member.dao")
public class MallMemberApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallMemberApplication.class, args);
            log.info("会员服务启动成功");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("会员服务启动失败", e);
        }
    }

}
