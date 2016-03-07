package cn.nlsde.annotation;

import java.lang.annotation.*;

/**
 * Created by zhangwj on 16/3/5.
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {
}
