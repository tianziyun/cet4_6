package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 考试
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
public class ExamExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "考试类型（0：四级，1：六级）")
    private Integer type;
    @ExcelProperty(value = "报名开始时间")
    private Date enrollBeginTime;
    @ExcelProperty(value = "报名结束时间")
    private Date enrollEndTime;
    @ExcelProperty(value = "考试开始时间")
    private Date beginTime;
    @ExcelProperty(value = "考试结束时间")
    private Date endTime;
    @ExcelProperty(value = "费用")
    private Integer cost;

}