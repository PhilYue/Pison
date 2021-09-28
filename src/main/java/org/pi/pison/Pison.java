package org.pi.pison;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * <p>todo</p>
 *
 * @author phil
 * @description todo
 * @createAt 2020-09-09 10:56
 * @since 1.0
 */
public class Pison {

    private Pison() {
    }

    /***
     * merge deep
     * @param source
     * @param target
     * @throws JSONException
     */
    public static void deepMerge(JSONObject source, JSONObject target) throws JSONException {

        Set<String> targetKeySet = target.getInnerMap().keySet();

        source
                .getInnerMap()
                .keySet()
                .forEach(key -> {
                    Object value = source.get(key);
                    if (!targetKeySet.contains(key)) {
                        target.put(key, value);
                    } else {
                        if (value instanceof JSONObject) {
                            JSONObject valueJson = (JSONObject)value;
                            deepMerge(valueJson, target.getJSONObject(key));
                        } else {
                            target.put(key, value);
                        }
                    }
                });
    }
}
