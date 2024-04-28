package io.renren.modules.demo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 教务处
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@ApiModel(value = "教务处")
public class AffairsOfficeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "教职工号")
	private String no;

	@ApiModelProperty(value = "")
	private String name;

	@ApiModelProperty(value = "")
	private String password;


}