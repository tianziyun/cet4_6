package io.renren.modules.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.PlaceDao;
import io.renren.modules.demo.dto.PlaceDTO;
import io.renren.modules.demo.entity.PlaceEntity;
import io.renren.modules.demo.service.PlaceService;
import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 考场
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-12
 */
@Service
public class PlaceServiceImpl extends CrudServiceImpl<PlaceDao, PlaceEntity, PlaceDTO> implements PlaceService {

    @Override
    public QueryWrapper<PlaceEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PlaceEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }


}