package cn.lyz.micromall.member.dao;

import cn.lyz.micromall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:14:29
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
