package me.hireny.openest.core;

import java.io.Serializable;

/**
 * @ClassName: SecuritySerializable
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:33
 * @Description: TODO   序列化定义
 */
public interface SecuritySerializable extends Serializable {
    /**
     * 序列化
     *
     * @return  字节数组
     */
    byte[] getBytes();
}
