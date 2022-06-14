package com.self.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置属性类
 * 用户封装配置文件中配置的参数信息
 *
 * @author zzw
 * @date 2022-06-14
 *
 */

@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private String property1;

    private String property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
}
