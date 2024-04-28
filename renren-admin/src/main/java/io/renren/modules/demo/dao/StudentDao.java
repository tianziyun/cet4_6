package io.renren.modules.demo.dao;

import io.renren.common.dao.BaseDao;
import io.renren.modules.demo.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Mapper
public interface StudentDao extends BaseDao<StudentEntity> {
	@Select("select url from sys_oss where id=#{ossId}")
    String getPhotoUrl(Long ossId);
}