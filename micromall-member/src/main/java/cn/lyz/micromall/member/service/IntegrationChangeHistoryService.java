package cn.lyz.micromall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:14:29
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

