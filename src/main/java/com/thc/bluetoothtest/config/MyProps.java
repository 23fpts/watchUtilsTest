package com.thc.bluetoothtest.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.config
 * @Description:
 * @date 2020/10/22 2:40 下午
 */
@Component
@ConfigurationProperties(prefix="system")
@Data
public class MyProps {

    public String url;
}
