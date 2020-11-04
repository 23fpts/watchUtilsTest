package com.thc.bluetoothtest.service;

import com.thc.bluetoothtest.mapper.WatchDataHexMapper;
import com.thc.bluetoothtest.mapper.WatchDataMapper;
import com.thc.bluetoothtest.model.WatchData;
import com.thc.bluetoothtest.model.WatchDataHex;
import com.thc.bluetoothtest.utils.WatchDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.service
 * @Description:
 * @date 2020/11/4 7:50 下午
 */
@Service
public class WatchService {

    @Autowired
    private WatchDataHexMapper watchDataHexMapper;

    @Autowired
    private WatchDataMapper watchDataMapper;

    /**
     * 16进制数据库数据转为真实数据
     * @param id 16进制数据库ID
     */
    public WatchData HexDataToData(Integer id) {
        WatchDataHex watchDataHex = watchDataHexMapper.selectById(id);
        WatchData watchData = WatchDataUtil.HexDataToData(watchDataHex.getData());
        // System.out.println(watchData);
        watchData.setUserId(1);
        watchDataMapper.insert(watchData);
        return watchData;
    }
}
