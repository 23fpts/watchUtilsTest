package com.thc.bluetoothtest.controller;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thc.bluetoothtest.config.MyProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.controller
 * @Description:
 * @date 2020/9/29 7:39 下午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private MyProps myProps;

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("testApi")
    public Map<String, Object> testApi() throws Exception {
        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(myProps.getUrl());
            String result = HttpUtil.get(myProps.getUrl());
            System.out.println(result);
            JSONObject json = JSON.parseObject(result);
            System.out.println(json);
            Map<String, Object> res = new HashMap<>();
            res.put("status", 1);
            res.put("data", json);
            return res;
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("第三方接口异常");
        }
    }
}