package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.AffairsOfficeDao;
import io.renren.modules.demo.dto.AffairsOfficeDTO;
import io.renren.modules.demo.entity.AffairsOfficeEntity;
import io.renren.modules.demo.service.AffairsOfficeService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 教务处
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Service
public class AffairsOfficeServiceImpl extends CrudServiceImpl<AffairsOfficeDao, AffairsOfficeEntity, AffairsOfficeDTO> implements AffairsOfficeService {

    @Override
    public QueryWrapper<AffairsOfficeEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<AffairsOfficeEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}