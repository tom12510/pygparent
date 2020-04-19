package com.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * (PygUser)实体类
 *
 * @author makejava
 * @since 2020-04-19 01:10:18
 */
@Data
@TableName("PYG-USER")
public class PygUser extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -71152611907758732L;

    @TableField("id")
    private Long id;
    /**
    * 用户名字
    */
    @TableField("username")
    private String username;
    /**
    * 密码 加密
    */
    @TableField("password")
    private String password;
    /**
    * 电话
    */
    @TableField("phone")
    private String phone;
    /**
    * 邮箱
    */
    @TableField("email")
    private String email;
    /**
    * 昵称
    */
    @TableField("nickName")
    private String nickName;
    /**
    * 名字
    */
    @TableField("name")
    private String name;
    /**
    * 状态  1 生效  2 未激活  3 已冻结  
    */
    @TableField("status")
    private Integer status;
    /**
    * 头像地址
    */
    @TableField("headPic")
    private String headPic;
    /**
    * 绑定qq
    */
    @TableField("qq")
    private String qq;
    /**
    * 微信openId
    */
    @TableField("wechat")
    private String wechat;
    /**
    * 是否绑定电话
    */
    @TableField("isMobileCheck")
    private Integer isMobileCheck;
    /**
    * 是否绑定邮箱
    */
    @TableField("isEmailCheck")
    private String isEmailCheck;
    /**
    *  性别 1男 2 女
    */
    @TableField("sex")
    private Integer sex;
    /**
    * 用户等级 1- 99
    */
    @TableField("userLevel")
    private Integer userLevel;
    /**
    * 经验 1-无限 每级递增200
    */
    @TableField("experienceValue")
    private Integer experienceValue;
    /**
    * 生日
    */
    @TableField("birthday")
    private LocalDate birthday;
    /**
    * 最后登录时间
    */
    @TableField("lastLoginTime")
    private LocalDateTime lastLoginTime;

}