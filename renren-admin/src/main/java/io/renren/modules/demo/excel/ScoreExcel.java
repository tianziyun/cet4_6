package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 成绩
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
public class ScoreExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "考试id")
    private Long examId;
    @ExcelProperty(value = "学生id")
    private Long studentId;
    @ExcelProperty(value = "分数")
    private Integer mark;
    @ExcelProperty(value = "是否通过(0:不通过 ,1：通过)")
    private Integer isPass;

}