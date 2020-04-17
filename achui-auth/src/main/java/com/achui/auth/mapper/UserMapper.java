package com.achui.auth.mapper;

import com.achui.common.entity.system.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author portz
 * @date 2020/4/17 21:17
 */
public interface UserMapper extends BaseMapper<SystemUser> {
    SystemUser findByName(String username);
}
