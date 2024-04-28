package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Data
@ApiModel(value = "")
public class StudentDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "学号")
    private Long no;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "性别(0:女 1：男 )")
    private Integer gender;

    @ApiModelProperty(value = "")
    private String password;

    @ApiModelProperty(value = "身份证（0:国内身份证）")
    private Integer idType;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "学校")
    private String school;

    @ApiModelProperty(value = "学历（本科。。）")
    private String educationLevel;

    @ApiModelProperty(value = "入学年份")
    private Integer year;

    @ApiModelProperty(value = "学制（4年。。。）")
    private Integer educationalSystem;

    @ApiModelProperty(value = "年级（21。。）")
    private Integer grade;

    @ApiModelProperty(value = "院系")
    private String college;

    @ApiModelProperty(value = "专业")
    private String profession;

    @ApiModelProperty(value = "班级")
    private String classes;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "")
    private String email;

//    @ApiModelProperty(value = "四级是否通过(0:不通过，1：通过）")
//    private Integer level4;
//
//    @ApiModelProperty(value = "六级是否通过(0:不通过，1：通过）")
//    private Integer level6;

    @ApiModelProperty(value = "学生照片(oss_id)")
    private Long photo;

}