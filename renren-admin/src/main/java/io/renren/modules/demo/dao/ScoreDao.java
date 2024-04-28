package io.renren.modules.demo.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.demo.entity.ScoreEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成绩
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Mapper
public interface ScoreDao extends BaseDao<ScoreEntity> {
	
}