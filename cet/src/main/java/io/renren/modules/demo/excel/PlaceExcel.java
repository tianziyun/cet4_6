package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

import java.util.Date;

/**
 * 考场
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
public class PlaceExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "考场名")
    private String name;
    @ExcelProperty(value = "考场位置")
    private String position;
    @ExcelProperty(value = "座位数")
    private Integer seatsNumber;

}