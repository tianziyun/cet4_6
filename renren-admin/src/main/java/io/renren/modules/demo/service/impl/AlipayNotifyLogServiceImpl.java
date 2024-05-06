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

import io.renren.common.service.impl.CrudServiceImpl;
import io.renren.modules.demo.dao.AlipayNotifyLogDao;
import io.renren.modules.demo.dto.AlipayNotifyLogDTO;
import io.renren.modules.demo.entity.AlipayNotifyLogEntity;
import io.renren.modules.demo.service.AlipayNotifyLogService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 支付宝回调日志
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class AlipayNotifyLogServiceImpl extends CrudServiceImpl<AlipayNotifyLogDao, AlipayNotifyLogEntity, AlipayNotifyLogDTO> implements AlipayNotifyLogService {

    @Override
    public QueryWrapper<AlipayNotifyLogEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<AlipayNotifyLogEntity> wrapper = new QueryWrapper<>();

        String outTradeNo = (String)params.get("outTradeNo");
        wrapper.eq(StringUtils.isNotBlank(outTradeNo), "out_trade_no", outTradeNo);

        String notifyId = (String)params.get("notifyId");
        wrapper.eq(StringUtils.isNotBlank(notifyId), "notify_id", notifyId);

        String tradeStatus = (String)params.get("tradeStatus");
        wrapper.eq(StringUtils.isNotBlank(tradeStatus), "trade_status", tradeStatus);

        return wrapper;
    }

}