package io.renren.modules.demo.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.ExamDao;
import io.renren.modules.demo.dto.ExamDTO;
import io.renren.modules.demo.entity.ExamEntity;
import io.renren.modules.demo.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 考试
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Service
public class ExamServiceImpl extends CrudServiceImpl<ExamDao, ExamEntity, ExamDTO> implements ExamService {

    @Override
    public QueryWrapper<ExamEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ExamEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}