package dev.xuanran.mybatisplusdemo.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * Created by XuanRan on 2022/10/2
 */
@Data
public class User {
    /**
     * ASSIGN_ID 随机19位数ID（雪花算法）
     * ASSIGN_UUID UUID
     * Input 自己设置
     * None 什么也不设置
     *
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;

    @TableField(exist = false) // 不是数据库中的字段
    private String password;

    private Integer age;
    private String email;

    @TableLogic
    private Integer deleted;

    /**
     * 使用自动填充策略来更新数据时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 自动填充策略
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
