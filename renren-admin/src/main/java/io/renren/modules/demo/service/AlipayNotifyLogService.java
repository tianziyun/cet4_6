/**
 * Copyright (c) 2021 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.modules.demo.service;


import io.renren.common.service.CrudService;
import io.renren.modules.demo.dto.AlipayNotifyLogDTO;
import io.renren.modules.demo.entity.AlipayNotifyLogEntity;

/**
 * 支付宝回调日志
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface AlipayNotifyLogService extends CrudService<AlipayNotifyLogEntity, AlipayNotifyLogDTO> {

}