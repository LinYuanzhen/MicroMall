package cn.lyz.micromall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:14:28
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

