package com.achui.common.entity.system;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author portz
 * @date 2020/4/23 22:20
 */
@Data
@TableName("t_user_role")
public class UserRole implements Serializable {

    @TableField(value = "USER_ID")
    private Long userId;

    @TableField(value = "ROLE_ID")
    private Long roleId;

}
