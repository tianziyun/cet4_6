package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 成绩
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@ApiModel(value = "成绩")
public class ScoreDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "考试id")
	private Long examId;

	@ApiModelProperty(value = "学生id")
	private Long studentId;

	@ApiModelProperty(value = "分数")
	private Integer mark;

	@ApiModelProperty(value = "是否通过(0:不通过 ,1：通过)")
	private Integer isPass;


}