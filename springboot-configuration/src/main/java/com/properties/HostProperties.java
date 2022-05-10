package com.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author YanZhao
 * @description: TODO
 * @date 2022年05月10日 18:01
 */

@Data
@Component
@ConfigurationProperties(prefix = "server")
public class HostProperties {

    private String port;

    private String address;
}
