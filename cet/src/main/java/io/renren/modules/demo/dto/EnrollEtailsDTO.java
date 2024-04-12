package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 报名信息
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@ApiModel(value = "报名信息")
public class EnrollEtailsDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "考试id")
	private Long examId;

	@ApiModelProperty(value = "学生id")
	private Long studentId;

	@ApiModelProperty(value = "考场id")
	private Long placeId;

	@ApiModelProperty(value = "报名时间")
	private Date enrollTime;

	@ApiModelProperty(value = "是否缴费(0:未交1：交）")
	private Integer isPay;

	@ApiModelProperty(value = "座位号")
	private Integer seat;

	@ApiModelProperty(value = "连接oss表（准考证pdf链接）")
	private Long ossId;


}