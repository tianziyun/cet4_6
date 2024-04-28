package io.renren.modules.demo.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * 教务处
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
public class AffairsOfficeExcel {
    @ExcelProperty(value = "")
    private Long id;
    @ExcelProperty(value = "教职工号")
    private String no;
    @ExcelProperty(value = "")
    private String name;
    @ExcelProperty(value = "")
    private String password;

}