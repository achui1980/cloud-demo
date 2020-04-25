package com.achui.server.system.service;

import com.achui.common.entity.system.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author portz
 * @date 2020/4/23 22:22
 */
public interface IUserRoleService extends IService<UserRole> {

    void deleteUserRolesByRoleId(String[] roleIds);

    void deleteUserRolesByUserId(String[] userIds);
}
