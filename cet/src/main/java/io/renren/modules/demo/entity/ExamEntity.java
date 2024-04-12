package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 考试
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@TableName("exam")
public class ExamEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 考试类型（0：四级，1：六级）
     */
	private Integer type;
    /**
     * 报名开始时间
     */
	private Date enrollBeginTime;
    /**
     * 报名结束时间
     */
	private Date enrollEndTime;
    /**
     * 费用
     */
	private Integer cost;
}