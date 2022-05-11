package com.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author YanZhao
 * @description 指定文件
 * @date 2022年05月11日 20:31
 */

@Data
@Component
@PropertySource("classpath:application.yaml")
public class HostFileProperties {

    @Value("${server.port}")
    private String port;
    @Value("${server.address}")
    private String address;
}
