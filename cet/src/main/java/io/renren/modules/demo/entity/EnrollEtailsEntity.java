package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 报名信息
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@TableName("enroll_etails")
public class EnrollEtailsEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 考试id
     */
	private Long examId;
    /**
     * 学生id
     */
	private Long studentId;
    /**
     * 考场id
     */
	private Long placeId;
    /**
     * 报名时间
     */
	private Date enrollTime;
    /**
     * 是否缴费(0:未交1：交）
     */
	private Integer isPay;
    /**
     * 座位号
     */
	private Integer seat;
    /**
     * 连接oss表（准考证pdf链接）
     */
	private Long ossId;
}