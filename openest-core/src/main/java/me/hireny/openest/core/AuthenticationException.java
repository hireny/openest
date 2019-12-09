package me.hireny.openest.core;

/**
 * @ClassName: AuthenticationException
 * @Author: hireny
 * @Date: Create in 2019/12/09 13:58
 * @Description: TODO   安全认证相关异常
 */
public class AuthenticationException extends RuntimeException {
    private static final long serialVersionUID = 4731170811913625204L;

    public AuthenticationException() {
        super();
    }

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthenticationException(Throwable cause) {
        super(cause);
    }

    protected AuthenticationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
