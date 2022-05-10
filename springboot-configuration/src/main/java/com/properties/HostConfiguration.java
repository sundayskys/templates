package com.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author YanZhao
 * @description: TODO
 * @date 2022年05月10日 17:57
 */

@Data
@Component
public class HostConfiguration {

    @Value("${server.port}")
    private String port;
    @Value("${server.address}")
    private String address;
}
