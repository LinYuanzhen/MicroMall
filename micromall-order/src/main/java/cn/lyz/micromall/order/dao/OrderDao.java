package cn.lyz.micromall.order.dao;

import cn.lyz.micromall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:23:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
