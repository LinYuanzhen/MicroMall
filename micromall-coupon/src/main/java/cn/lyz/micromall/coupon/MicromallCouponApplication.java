package cn.lyz.micromall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class MicromallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallCouponApplication.class, args);
    }

}
