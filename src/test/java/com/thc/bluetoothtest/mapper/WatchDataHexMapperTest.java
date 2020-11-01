package com.thc.bluetoothtest.mapper;

import com.thc.bluetoothtest.model.WatchDataHex;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.mapper
 * @Description:
 * @date 2020/11/1 2:34 下午
 */
@SpringBootTest
class WatchDataHexMapperTest {

    @Autowired
    private WatchDataHexMapper watchDataHexMapper;

    @Test
    public void test() {
        WatchDataHex watchDataHex = new WatchDataHex();
        watchDataHex.setData("test");
        watchDataHexMapper.insert(watchDataHex);
    }

}