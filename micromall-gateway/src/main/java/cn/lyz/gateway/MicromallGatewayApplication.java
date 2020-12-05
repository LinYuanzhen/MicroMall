package cn.lyz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
//排除和数据源相关的配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MicromallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallGatewayApplication.class, args);
    }

}
