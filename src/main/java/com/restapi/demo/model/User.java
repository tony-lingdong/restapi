package com.restapi.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Author: huld
 * @Date: 2020-04-16 17:35
 */
@Data
@ApiModel(value = "用户信息实体类")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @ApiModelProperty(value = "用户id")
    private int id;
    @ApiModelProperty(value = "用户名字")
    private String name;
    @ApiModelProperty
    private String qq;
    private String weixin;
    private String username;
    @ApiModelProperty
    @Max(value = 0,message = "性别只能为0和1,0为男1为女")
    @Min(value = 1,message = "性别只能为0和1,0为男1为女")
    private int sex;
    private String password;
}
