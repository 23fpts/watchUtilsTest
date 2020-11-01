package com.thc.bluetoothtest.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.config
 * @Description:
 * @date 2020/11/1 2:40 下午
 */
@Configuration
@MapperScan("com.thc.bluetoothtest.mapper")
public class MybatisPlusConfig {
}
