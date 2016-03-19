package cn.nlsde.annotation;

import java.lang.annotation.*;

/**
 * 方法或者类级别如果有该注解，则该接口对应的方法必须要求用户登录
 * Created by zhangwj on 16/3/5.
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginRequired {
}
