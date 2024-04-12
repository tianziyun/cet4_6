package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.ScoreDao;
import io.renren.modules.demo.dto.ScoreDTO;
import io.renren.modules.demo.entity.ScoreEntity;
import io.renren.modules.demo.service.ScoreService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 成绩
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Service
public class ScoreServiceImpl extends CrudServiceImpl<ScoreDao, ScoreEntity, ScoreDTO> implements ScoreService {

    @Override
    public QueryWrapper<ScoreEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ScoreEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}