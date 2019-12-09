package me.hireny.openest.core;

/**
 * @ClassName: Subject
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:40
 * @Description: TODO   安全认证主题定义，非常核心的接口
 *
 * @param <K>   主题承载session key类型
 * @param <V>   主题承载session value类型
 */
public interface Subject<K, V> extends SecuritySerializable {

    /**
     * 获取当前主题关联的唯一标识
     * <p>每个标识代表一个用户</p>
     * <p>多个标识可能指向同一个用户</p>
     * @return 唯一标识
     */
    String getPrincipal();

    /**
     * 获取当前主题关联的session实例
     * @return  session实例
     */
    V getSession();

    /**
     * 主题是否有效
     * @return  <b>true</b> 有效，<b>false</b> 无效
     */
    boolean isValid();
}
