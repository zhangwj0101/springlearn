package cn.nlsde.annotation;

import cn.nlsde.privilege.Privilege;

import java.lang.annotation.*;

/**
 * 方法或者类级别如果有该注解，表示具有该权限的用户才可以访问
 * Created by zhangwj on 16/3/5.
 */
@Documented
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrivilegeRequired {
    Privilege[] privileges() default {};
}
