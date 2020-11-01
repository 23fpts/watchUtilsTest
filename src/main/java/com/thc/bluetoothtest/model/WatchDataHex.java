package com.thc.bluetoothtest.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author thc
 * @Title:
 * @Package com.thc.bluetoothtest.model
 * @Description:
 * @date 2020/11/1 2:18 下午
 */
@Data
@TableName("watch_data_hex")
public class WatchDataHex implements Serializable {
    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String data;

    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @TableField(value = "is_deleted", fill = FieldFill.INSERT)
    private Boolean deleted;
}
