package me.hireny.openest.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: DefaultSession
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:42
 * @Description: TODO   默认会话实现
 */
public class DefaultSession implements Session<String, Object> {

    /**
     * 会话中保存的用户全局唯一id域
     */
    public static final String SESSION_UNIONID = "_unionid";

    /**
     * 会话中保存的用户角色域
     */
    public static final String SESSION_ROLES = "_roles";

    /**
     * 会话中保存的记住登陆状态域
     */
    public static final String SESSION_REMEMBER = "_remember";

    /**
     * 会话数据容器
     */
    private Map<String, Object> container = new HashMap<>();

    @Override
    public Object get(String key) {
        return container.get(key);
    }

    @Override
    public Object set(String key, Object value) {
        return container.put(key, value);
    }

    @Override
    public byte[] getBytes() {
        return new byte[0];
    }
}
