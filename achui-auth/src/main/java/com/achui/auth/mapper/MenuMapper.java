package com.achui.auth.mapper;

import com.achui.common.entity.system.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author portz
 * @date 2020/4/17 21:18
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> findUserPermissions(String username);
}
