package com.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author YanZhao
 * @description: TODO
 * @date 2022年05月10日 18:01
 */

@Data
public class HostProperties {

    @Value("server.port")
    private String port;
    @Value("server.address")
    private String address;
}
