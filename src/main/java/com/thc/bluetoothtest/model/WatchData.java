package com.thc.bluetoothtest.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.model
 * @Description:
 * @date 2020/11/3 2:52 下午
 */
@Data
@TableName("watch_data")
public class WatchData implements Serializable {


    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String mac;

    private Integer sportsTime;

    private Integer realTimeHeartRate;

    private Integer averageHeartRate;

    private Integer distance;

    private Integer calorie;

    private Integer totalStepCount;

    private Integer realTimeCadence;

    private Integer averageCadence;

    private Integer sportsType;

    private BigDecimal realTimeSpeed;

    private BigDecimal averageSpeed;

    private Integer sportsStatus;

    private BigDecimal longitude;

    private BigDecimal latitude;

    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    private Boolean deleted;

}
