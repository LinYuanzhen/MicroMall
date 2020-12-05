package cn.lyz.micromall.coupon.dao;

import cn.lyz.micromall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 14:59:47
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
