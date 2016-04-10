package cn.nlsde.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by zwj on 2016/4/9.
 */
@Aspect
public class MyAspectJ {

    @Pointcut("execution( ** cn.nlsde.aop.TestInter.sayhello(..))")
    private void point() {
    }

    @Before(value = "point()")
    public void before() {
        System.out.println("before hha");
    }

    @After("point()")
    public void after(JoinPoint jp) {
        System.out.println(jp.getTarget());
    }

}
