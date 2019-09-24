package io.lemon.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 注册中心启动主类
 *
 * @author jiaqing.xu@hand-china.com
 * @date 2019-09-24 22:00
 */
@SpringBootApplication
@EnableEurekaServer
public class LemonRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LemonRegisterApplication.class, args);
    }

}
