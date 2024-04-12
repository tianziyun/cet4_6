package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Data
@TableName("student")
public class StudentEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 学号
     */
	private Long no;
    /**
     * 
     */
	private String name;
    /**
     * 性别(0:女 1：男 )
     */
	private Integer gender;
    /**
     * 
     */
	private String password;
    /**
     * 身份证（0:国内身份证）
     */
	private Integer idType;
    /**
     * 身份证号
     */
	private String idCard;
    /**
     * 学校
     */
	private String school;
    /**
     * 学历（本科。。）
     */
	private String educationLevel;
    /**
     * 入学年份
     */
	private Integer year;
    /**
     * 学制（4年。。。）
     */
	private Integer system;
    /**
     * 年级（21。。）
     */
	private Integer grade;
    /**
     * 院系
     */
	private String college;
    /**
     * 专业
     */
	private String profession;
    /**
     * 班级
     */
	private String classes;
    /**
     * 省份
     */
	private String province;
    /**
     * 
     */
	private String email;
    /**
     * 四级是否通过(0:不通过，1：通过）
     */
	private Integer level4;
    /**
     * 六级是否通过(0:不通过，1：通过）
     */
	private Integer level6;
}