package me.hireny.openest.core;

/**
 * @ClassName: Session
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:34
 * @Description: TODO   会话定义
 */
public interface Session<K, V> extends SecuritySerializable {
    /**
     * 获取会话数据
     *
     * @param key   the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if this map contains no mapping for the key
     */
    V get(K key);

    /**
     * 设置会话数据
     * @param key   key with which the specified value is to be associated
     * @param value value to be associated with the specified key
     * @return  the previous value associated with key, or null if there was no mapping for key. (A null return can also indicate that the map previously associated null with key, if the implementation supports null values.)
     */
    V set(K key, V value);
}
