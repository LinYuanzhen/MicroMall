package cn.lyz.micromall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:23:37
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

