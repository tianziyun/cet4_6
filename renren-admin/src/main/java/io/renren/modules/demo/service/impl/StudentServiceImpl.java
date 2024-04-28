package io.renren.modules.demo.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.page.PageData;
import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.StudentDao;
import io.renren.modules.demo.dto.StudentDTO;
import io.renren.modules.demo.entity.StudentEntity;
import io.renren.modules.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0 2024-04-11
 */
@Service
public class StudentServiceImpl extends CrudServiceImpl<StudentDao, StudentEntity, StudentDTO> implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public QueryWrapper<StudentEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<StudentEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StrUtil.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public PageData<StudentDTO> page(Map<String, Object> params) {
        PageData<StudentDTO> page = super.page(params);
        List<StudentDTO> list = page.getList();
        list.stream()
                .forEach(dto -> dto.setPhotoUrl(studentDao.getPhotoUrl(dto.getPhoto())));
        page.setList(list);
        return page;
    }
}