package cn.lyz.micromall.product.dao;

import cn.lyz.micromall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 13:07:37
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
