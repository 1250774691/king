package com.ibeifeng.spring.proxy;

import com.ibeifeng.spring.log.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by zhm on 2017/2/16.
 */
@Component
public class LogAspect {
    /**
     * 前置通知
     * 1*：方法的任意返回值
     * 2*：包下所有类
     * 3*：以add开头的所有方法
     * ..：方法的任意参数
     */
    public void methodStart(JoinPoint point) {
        System.out.println(point.getSignature().getName());
        Logger.log("在方法之前执行了操作");
    }

    /**
     * 后置通知
     */
    public void methodAfter() {
        Logger.log("在方法之后执行了操作");
    }

    /**
     * 环绕通知
     *
     * @param joinPoint
     */
    public void methodAround(ProceedingJoinPoint joinPoint) {
        try {
            Logger.log("执行了操作");
            joinPoint.proceed();
            Logger.log("执行了操作");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void methodReturn(JoinPoint point) {
        System.out.println(point.getSignature().getName());
        Logger.log("在方法正常返回之后执行操作");
    }

    public void methodThrow(JoinPoint point) {
        System.out.println(point.getSignature().getName());
        Logger.log("在方法引发异常退出时执行操作");
    }
}