package io.renren.modules.demo.dto;/**
 * @author tian
 * @date 2024/5/7 17:22
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import io.renren.common.utils.DateUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tian
 * @date 2024/5/7 17:22
 */
@Data
@ApiModel(value = "订单")
public class OrderDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @ApiModelProperty(value = "订单ID")
    private Long orderId;
    @ApiModelProperty(value = "产品ID")
    private Long productId;
    @ApiModelProperty(value = "产品名称")
    private String productName;
    @ApiModelProperty(value = "支付金额")
    private BigDecimal payAmount;
    @ApiModelProperty(value = "订单状态")
    private Integer status;
    @ApiModelProperty(value = "购买者ID")
    private Long userId;
    @ApiModelProperty(value = "支付时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date payAt;
    @ApiModelProperty(value = "下单时间")
    @JsonFormat(pattern = DateUtils.DATE_TIME_PATTERN)
    private Date createDate;

}