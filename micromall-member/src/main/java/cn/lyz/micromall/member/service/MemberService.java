package cn.lyz.micromall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:14:29
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

