package com.self.config;

import com.self.service.DemoService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 * 用于自动配置DemoService对象
 *
 * @author zzw
 */

@Configuration
@EnableAutoConfiguration()
public class DemoAutoConfiguration {

    private DemoProperties properties;

    public DemoAutoConfiguration(DemoProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(value = {DemoService.class})
    public DemoService demoService() {
        return new DemoService(properties.getProperty1(), properties.getProperty2());
    }
}
