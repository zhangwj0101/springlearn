package cn.nlsde.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by zwj on 2016/4/9.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("@@ " + methodInvocation.getMethod().getName());
        return methodInvocation.proceed();
    }
}
