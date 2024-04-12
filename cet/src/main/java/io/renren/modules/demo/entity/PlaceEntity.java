package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 考场
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@TableName("place")
public class PlaceEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 考场名
     */
	private String name;
    /**
     * 考场位置
     */
	private String position;
    /**
     * 座位数
     */
	private Integer seatsNumber;
}