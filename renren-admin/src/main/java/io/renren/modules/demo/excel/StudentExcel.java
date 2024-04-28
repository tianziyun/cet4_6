package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Data
public class StudentExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "学号")
    private Long no;
    @ExcelProperty(value = "")
    private String name;
    @ExcelProperty(value = "性别(0:女 1：男 )")
    private Integer gender;
    @ExcelProperty(value = "")
    private String password;
    @ExcelProperty(value = "身份证（0:国内身份证）")
    private Integer idType;
    @ExcelProperty(value = "身份证号")
    private String idCard;
    @ExcelProperty(value = "学校")
    private String school;
    @ExcelProperty(value = "学历（本科。。）")
    private String educationLevel;
    @ExcelProperty(value = "入学年份")
    private Integer year;
    @ExcelProperty(value = "学制（4年。。。）")
    private Integer educationalSystem;
    @ExcelProperty(value = "年级（21。。）")
    private Integer grade;
    @ExcelProperty(value = "院系")
    private String college;
    @ExcelProperty(value = "专业")
    private String profession;
    @ExcelProperty(value = "班级")
    private String classes;
    @ExcelProperty(value = "省份")
    private String province;
    @ExcelProperty(value = "")
    private String email;
    @ExcelProperty(value = "四级是否通过(0:不通过，1：通过）")
    private Integer level4;
    @ExcelProperty(value = "六级是否通过(0:不通过，1：通过）")
    private Integer level6;
    @ExcelProperty("学生照片")
    private Long photo;
}