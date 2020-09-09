package com.pi.pison.core;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * <p>todo</p>
 *
 * @author phil
 * @description todo
 * @createAt 2020-09-09 11:01
 * @since 1.0
 */
public abstract class FastJsonWhimsAdapter implements JsonWhims<JSONObject> {

    @Override
    public void deepMerge(JSONObject source, JSONObject targat) {
        // noop
    }
}
