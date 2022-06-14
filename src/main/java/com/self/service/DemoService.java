package com.self.service;

/**
 * 服务类
 *
 * @author zzw
 * @data 2022-06-14
 */


public class DemoService {

    private String property1;

    private String property2;

    public DemoService(String property1, String property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    public String demo() {
        return "配置1 = " + property1 + ",配置2 = " + property2;
    }
}
