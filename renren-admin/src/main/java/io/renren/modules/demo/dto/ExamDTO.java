package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 考试
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@ApiModel(value = "考试")
public class ExamDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "考试类型（0：四级，1：六级）")
	private Integer type;

	@ApiModelProperty(value = "报名开始时间")
	private Date enrollBeginTime;

	@ApiModelProperty(value = "报名结束时间")
	private Date enrollEndTime;

	@ApiModelProperty(value = "费用")
	private Integer cost;
	@ApiModelProperty(value = "考试开始时间")
	private Date beginTime;

	@ApiModelProperty(value = "考试结束时间")
	private Date endTime;

}