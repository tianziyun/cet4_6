package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.EnrollEtailsDao;
import io.renren.modules.demo.dto.EnrollEtailsDTO;
import io.renren.modules.demo.entity.EnrollEtailsEntity;
import io.renren.modules.demo.service.EnrollEtailsService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 报名信息
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Service
public class EnrollEtailsServiceImpl extends CrudServiceImpl<EnrollEtailsDao, EnrollEtailsEntity, EnrollEtailsDTO> implements EnrollEtailsService {

    @Override
    public QueryWrapper<EnrollEtailsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<EnrollEtailsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}