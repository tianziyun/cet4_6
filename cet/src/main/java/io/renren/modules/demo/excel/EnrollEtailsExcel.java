package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 报名信息
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
public class EnrollEtailsExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "考试id")
    private Long examId;
    @ExcelProperty(value = "学生id")
    private Long studentId;
    @ExcelProperty(value = "考场id")
    private Long placeId;
    @ExcelProperty(value = "报名时间")
    private Date enrollTime;
    @ExcelProperty(value = "是否缴费(0:未交1：交）")
    private Integer isPay;
    @ExcelProperty(value = "座位号")
    private Integer seat;
    @ExcelProperty(value = "连接oss表（准考证pdf链接）")
    private Long ossId;

}