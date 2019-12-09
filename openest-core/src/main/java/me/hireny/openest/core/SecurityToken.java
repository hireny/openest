package me.hireny.openest.core;

/**
 * @ClassName: SecurityToken
 * @Author: hireny
 * @Date: Create in 2019/12/09 14:03
 * @Description: TODO   认证令牌定义
 */
public interface SecurityToken {

    /**
     * 记住登陆状态标记
     * @return
     *        <p><b>true</b> 用户勾选remember me，记住登陆状态</p>
     *        <p><b>false</b> 其他情况视为临时登陆，关闭浏览器窗口后自动退出登陆</p>
     */
    boolean isRemember();
}
