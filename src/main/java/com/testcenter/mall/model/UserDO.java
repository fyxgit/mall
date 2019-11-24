package com.testcenter.mall.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Program: mall
 * @Description：用户实体类-用于jpa测试
 * @Author: huaxin
 * @Aate: 2019/10/27
 *
 * jpa使用参考网址：https://juejin.im/post/5aa733af518825558a0646fb
 **/

@Entity
@Table(name = "AUTH_USER")
@Data
public class UserDO {
    @Id
    private Long id;
    @Column(length=32)
    private String name;
    @Column(length=32)
    private String account;
    @Column(length = 32)
    private String pwd;
}
