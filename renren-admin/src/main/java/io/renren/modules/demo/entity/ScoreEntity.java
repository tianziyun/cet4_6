package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 成绩
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@TableName("score")
public class ScoreEntity {

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
     * 分数
     */
	private Integer mark;
    /**
     * 是否通过(0:不通过 ,1：通过)
     */
	private Integer isPass;
}