package cn.lyz.micromall.member.dao;

import cn.lyz.micromall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:14:28
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
