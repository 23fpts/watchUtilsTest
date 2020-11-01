package com.thc.bluetoothtest.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thc.bluetoothtest.mapper.WatchDataHexMapper;
import com.thc.bluetoothtest.model.WatchDataHex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.service
 * @Description:
 * @date 2020/11/1 3:11 下午
 */
@Service
public class Json2DatabaseService {

    @Autowired
    private WatchDataHexMapper watchDataHexMapper;

    public void insert(String message) {
        JSONObject jsonObject = JSON.parseObject(message);
        String data = jsonObject.getString("data");
        WatchDataHex watchDataHex = new WatchDataHex();
        watchDataHex.setData(data);
        watchDataHexMapper.insert(watchDataHex);
    }
}
