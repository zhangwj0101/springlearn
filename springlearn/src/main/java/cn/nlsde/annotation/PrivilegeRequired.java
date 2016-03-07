package cn.nlsde.annotation;

import cn.nlsde.privilege.Privilege;

import java.lang.annotation.*;

/**
 * Created by zhangwj on 16/3/5.
 */
@Documented
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivilegeRequired {
    Privilege[] privileges() default {};
}
