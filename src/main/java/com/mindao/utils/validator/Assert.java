package com.mindao.utils.validator;

import org.apache.commons.lang.StringUtils;

import com.mindao.utils.RRException;

/**
 * 数据校验
 * @author ligc
 * @email 153277817@qq.com
 * @date 2017-03-23 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
