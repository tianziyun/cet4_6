/**
 * Copyright (c) 2021 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.demo.service.impl;

import com.alibaba.excel.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.IdWorker;

import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.OrderDao;
import io.renren.modules.demo.dto.OrderDTO;
import io.renren.modules.demo.entity.OrderEntity;
import io.renren.modules.demo.enums.OrderStatusEnum;
import io.renren.modules.demo.service.OrderService;
import io.renren.modules.security.user.SecurityUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

/**
 * 订单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class OrderServiceImpl extends CrudServiceImpl<OrderDao, OrderEntity, OrderDTO> implements OrderService {

    @Override
    public QueryWrapper<OrderEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<OrderEntity> wrapper = new QueryWrapper<>();

        String orderId = (String)params.get("orderId");
        wrapper.eq(StringUtils.isNotBlank(orderId), "order_id", orderId);

        String status = (String)params.get("status");
        wrapper.eq(StringUtils.isNotBlank(status), "status", status);

        String userId = (String)params.get("userId");
        wrapper.eq(StringUtils.isNotBlank(userId), "user_id", userId);

        wrapper.orderByDesc("create_date");

        return wrapper;
    }

    @Override
    public void save(OrderDTO dto) {
        dto.setOrderId(IdWorker.getId());
        dto.setUserId(SecurityUser.getUserId());
        dto.setStatus(OrderStatusEnum.WAITING.getValue());
        super.save(dto);
    }

    @Override
    public OrderEntity getByOrderId(Long orderId) {
        return baseDao.getByOrderId(orderId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void paySuccess(OrderEntity order) {
        baseDao.paySuccess(order.getOrderId(), OrderStatusEnum.FINISH.getValue(), new Date());
    }
}