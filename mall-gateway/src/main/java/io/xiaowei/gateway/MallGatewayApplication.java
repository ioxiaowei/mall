package io.xiaowei.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MallGatewayApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(MallGatewayApplication.class, args);
            log.info("Gateway Start Success");
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Gateway Start Fail", e);
        }
    }

}
