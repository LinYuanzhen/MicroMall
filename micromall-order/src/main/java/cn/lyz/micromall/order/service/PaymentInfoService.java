package cn.lyz.micromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:23:37
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

