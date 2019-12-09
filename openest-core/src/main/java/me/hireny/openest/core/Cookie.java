package me.hireny.openest.core;

/**
 * @ClassName: Cookie
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:36
 * @Description: TODO   Cookie定义
 */
public interface Cookie {
    /**
     * 转换为Http协议标准Cookie
     * @return  Http协议标准Cookie
     */
    javax.servlet.http.Cookie toHttpCookie();
}
