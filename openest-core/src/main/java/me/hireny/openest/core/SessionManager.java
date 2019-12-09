package me.hireny.openest.core;

/**
 * @ClassName: SessionManager
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:32
 * @Description: TODO   Session管理器
 */
public class SessionManager {

    protected static final ThreadLocal<Subject<?, ?>> LOCAL_SUBJECT = new ThreadLocal<>();

    /**
     * 获取当前线程中的主题
     * @param <K>
     * @param <V>
     * @return  主题
     */
    public static <K, V> Subject<K, V> getSubject() {
        return (Subject<K, V>) LOCAL_SUBJECT.get();
    }

    public static <K, V> void setSubject(Subject<K, V> subject) {
        LOCAL_SUBJECT.set(subject);
    }
}
