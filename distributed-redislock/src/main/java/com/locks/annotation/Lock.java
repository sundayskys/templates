package com.locks.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * @author YanZhao
 * @description 获取锁
 * @date 2022年05月19日 15:44
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Lock {

    String key();

    int expire() default 5;

    long waitTime() default Long.MIN_VALUE;

    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
