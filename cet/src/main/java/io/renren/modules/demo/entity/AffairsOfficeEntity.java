package io.renren.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 教务处
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Data
@TableName("affairs_office")
public class AffairsOfficeEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 教职工号
     */
	private String no;
    /**
     * 
     */
	private String name;
    /**
     * 
     */
	private String password;
}