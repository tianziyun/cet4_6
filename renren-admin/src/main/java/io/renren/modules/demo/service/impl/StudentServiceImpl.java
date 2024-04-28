package io.renren.modules.demo.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.StudentDao;
import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.entity.StudentEntity;
import io.renren.modules.demo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Service
public class StudentServiceImpl extends CrudServiceImpl<StudentDao, StudentEntity, StudentDTO> implements StudentService {

    @Override
    public QueryWrapper<StudentEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<StudentEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}