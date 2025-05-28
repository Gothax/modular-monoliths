package kr.co.loopz;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("kr.co.loopz")
public class OpenFeignConfig {
}
