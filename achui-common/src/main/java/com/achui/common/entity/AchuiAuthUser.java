package com.achui.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author portz
 * @date 2020/4/1 22:19
 */
@Data
public class AchuiAuthUser implements Serializable {
    private String username;

    private String password;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

    private boolean enabled = true;
}
