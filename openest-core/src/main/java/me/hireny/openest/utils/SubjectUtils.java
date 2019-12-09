package me.hireny.openest.utils;

import me.hireny.openest.core.DefaultSession;
import me.hireny.openest.core.Session;
import me.hireny.openest.core.SessionManager;
import me.hireny.openest.core.Subject;

/**
 * @ClassName: SubjectUtils
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:27
 * @Description: TODO   安全认证工具类
 */
public final class SubjectUtils {
    private SubjectUtils() {}

    /**
     * 判断用户是否为匿名状态
     *
     * @return
     *          <b>true</b> 匿名状态
     *          <br>
     *          <b>false</b> 登录状态
     */
    public static boolean isAnnoymous() {
        return !isAuthenticated();
    }

    /**
     * 判断用户是否为登录状态
     *
     * @return
     *          <b>true</b> 已登录
     *          <br>
     *          <b>false</b> 未登录
     */
    public static boolean isAuthenticated() {
        return getUnionid() != null;
    }

    /**
     * 是否使用Remember Me模式登陆
     * @return
     *        <p><b>true</b> 用户勾选remember me，记住登陆状态</p>
     *        <p><b>false</b> 其他情况视为临时登陆，关闭浏览器窗口后自动退出登陆</p>
     */
    public static boolean isRemember() {
        Session<String, Object> session = SubjectUtils.getSession();
        if (session == null) {
            return false;
        }
        Object remember = session.get(DefaultSession.SESSION_REMEMBER);
        if (remember == null) {
            return true;    //默认值
        }
        return (boolean) remember;
    }

    public static <T extends Subject<?, ?>> T getSubject() {
        Subject<?, ?> subject = SessionManager.getSubject();

        /**
         * 未登录
         */
        if (subject == null) {
            return null;
        }

        /**
         * 无效登录
         */
        if (!subject.isValid()) {
            return null;
        }

        /**
         * 返回主题
         */
        return (T) subject;
    }

    /**
     * 获取当前上下文中的会话
     * @param <T>   类型
     * @return      如果用户未登录，返回null
     */
    public static <T extends Session<?, ?>> T getSession() {
        Subject<?, ?> subject = SubjectUtils.getSubject();

        if (subject == null) {
            return null;
        }
        return (T) subject.getSession();
    }

    /**
     * 获取当前上下文中关联的用户全局唯一id
     * @return 如果用户未登录，返回null
     */
    public static String getUnionid() {
        Session<String, Object> session = SubjectUtils.getSession();
        if (session == null) {
            return null;
        }

        return (String) session.get(DefaultSession.SESSION_UNIONID);
    }

    /**
     * 设置当前上下文中关联的用户全局唯一id
     * <br>
     * <b>注意：此方法只应该在登陆时调用，其它任何情况都不要修改subject关联的unionid!</b>
     * @param unionid 用户全局唯一id
     */
    protected static void setUnionid(String unionid) {
        Session<String, Object> session = SubjectUtils.getSession();
        if (session == null) {
            return;
        }
        session.set(DefaultSession.SESSION_UNIONID, unionid);
    }
}
