package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 考场
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@ApiModel(value = "考场")
public class PlaceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "考场名")
	private String name;

	@ApiModelProperty(value = "考场位置")
	private String position;

	@ApiModelProperty(value = "座位数")
	private Integer seatsNumber;


}