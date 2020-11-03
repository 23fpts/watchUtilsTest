package com.thc.bluetoothtest.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
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

    /**
     * 如果json有data数据九插入数据，如果有addr数据就插入mac地址进表（插入前检查存在性）
     * @param message
     */
    public void insert(String message) {
        System.out.println("insert");
        System.out.println(message);
//        String data = message;
        JSONObject jsonObject = JSON.parseObject(message);
        if (jsonObject.containsKey("data")){
            String data = jsonObject.getString("data");
            WatchDataHex watchDataHex = new WatchDataHex();
            watchDataHex.setData(data);
            watchDataHexMapper.insert(watchDataHex);
        }
    }

    public void searchMac(String message) {
        JSONObject jsonObject = JSON.parseObject(message);
        if (jsonObject.containsKey("online")) {
            JSONArray array = jsonObject.getJSONArray("online");
            for (int i=0; i<array.size(); i++) {
                JSONObject jsonObj = array.getJSONObject(i);
                String addr = jsonObj.getString("addr");
                if ("24161FDAA3FD".equals(addr)|| "1AE8C21A2BF9".equals(addr) || "E7A85F0785E3".equals(addr)) {
//                    System.out.println(message);
                    System.out.println(array.getJSONObject(i));
                }
            }
        }
    }
}
