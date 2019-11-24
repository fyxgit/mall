package com.testcenter.mall.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Program: mall
 * @Description：
 * @Author: huaxin
 * @Aate: 2019/10/27
 **/

@ApiModel
@Data
public class User {
    @ApiModelProperty(value = "test", position = 0)
    private String name;
    @ApiModelProperty(value = "11", position = 1)
    private Integer age;
    @ApiModelProperty(value = "test@163.com", position = 2)
    private String email;
}
