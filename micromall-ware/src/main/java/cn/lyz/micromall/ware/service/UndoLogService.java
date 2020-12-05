package cn.lyz.micromall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 15:29:48
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

