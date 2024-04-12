package io.renren.modules.demo.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.demo.entity.ExamEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 考试
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Mapper
public interface ExamDao extends BaseDao<ExamEntity> {
	
}