package cn.lyz.micromall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "cn.lyz.micromall.member.feign")
@SpringBootApplication
public class MicromallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallMemberApplication.class, args);
    }

}
