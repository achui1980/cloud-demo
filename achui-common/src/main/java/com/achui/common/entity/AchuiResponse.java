package com.achui.common.entity;

import java.util.HashMap;

/**
 * @author portz
 * @date 2020/4/1 22:26
 */
public class AchuiResponse extends HashMap<String, Object> {
    public AchuiResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public AchuiResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public AchuiResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public String getMessage() {
        return String.valueOf(get("message"));
    }

    public Object getData() {
        return get("data");
    }
}
